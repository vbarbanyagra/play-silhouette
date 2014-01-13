/**
 * Original work: SecureSocial (https://github.com/jaliss/securesocial)
 * Copyright 2013 Jorge Aliss (jaliss at gmail dot com) - twitter: @jaliss
 *
 * Derivative work: Silhouette (https://github.com/mohiva/play-silhouette)
 * Modifications Copyright 2014 Mohiva Organisation (license at mohiva dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mohiva.play.silhouette.core

/**
 * A class representing an authentication method.
 */
case class AuthenticationMethod(method: String) {

  /**
   * Returns true if this authentication method equals another.
   *
   * Eg: user.authMethod.is(AuthenticationMethod.OAuth1)
   *
   * @param m An Authentication Method (see constants).
   * @return True if the method matches, false otherwise.
   */
  def is(m: AuthenticationMethod): Boolean = this == m
}

/**
 * Authentication methods used by the providers.
 */
object AuthenticationMethod {
  val OAuth1 = AuthenticationMethod("oauth1")
  val OAuth2 = AuthenticationMethod("oauth2")
  val OpenID = AuthenticationMethod("openId")
  val UserPassword = AuthenticationMethod("userPassword")
}