package com.sqq.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 20:44 10 10 2021
 */
public interface LoadBalancer {
     ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
