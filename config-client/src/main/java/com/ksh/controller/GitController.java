package com.ksh.controller;

import com.ksh.bean.GitAutoRefreshConfig;
import com.ksh.bean.GitConfig;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kongsh
 */
@RestController
@RefreshScope
public class GitController {

    private final GitConfig gitConfig;

    private final GitAutoRefreshConfig gitAutoRefreshConfig;

    public GitController(GitConfig gitConfig, GitAutoRefreshConfig gitAutoRefreshConfig) {
        this.gitConfig = gitConfig;
        this.gitAutoRefreshConfig = gitAutoRefreshConfig;
    }

    @GetMapping(value = "show")
    public Object show() {
        return gitConfig;
    }

    @GetMapping(value = "autoShow")
    public Object autoShow() {
        return gitAutoRefreshConfig;
    }
}