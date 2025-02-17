/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.networking.v1beta1.IPAddress;
import io.fabric8.kubernetes.api.model.networking.v1beta1.IPAddressList;
import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress;
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass;
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList;
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public interface V1beta1NetworkAPIGroupDSL extends Client {
  MixedOperation<Ingress, IngressList, Resource<Ingress>> ingresses();

  NonNamespaceOperation<IngressClass, IngressClassList, Resource<IngressClass>> ingressClasses();

  /**
   * API entrypoint for networking.k8s.io/v1beta1 IPAddress
   * <br>
   * IPAddress represents a single IP of a single IP Family. The object is designed to be used by APIs
   * that operate on IP addresses. The object is used by the Service core API for allocation of IP addresses.
   *
   * @return {@link NonNamespaceOperation} for IPAddress
   */
  NonNamespaceOperation<IPAddress, IPAddressList, Resource<IPAddress>> ipAddresses();
}
