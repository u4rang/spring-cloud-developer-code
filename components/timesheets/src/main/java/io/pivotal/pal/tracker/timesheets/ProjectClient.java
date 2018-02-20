package io.pivotal.pal.tracker.timesheets;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${registration.server.endpoint}")
interface ProjectClient {
    @RequestMapping(method = RequestMethod.GET, value = "/projects/{projectId}")
    ProjectInfo getProject(@PathVariable("projectId") long projectId);
}
