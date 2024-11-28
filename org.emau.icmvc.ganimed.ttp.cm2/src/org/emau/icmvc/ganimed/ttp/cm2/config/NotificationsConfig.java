/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notifications Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb <em>Send From Web</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getNotificationsConfig()
 * @model extendedMetaData="name='NotificationsConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface NotificationsConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Send From Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send From Web</em>' attribute.
	 * @see #isSetSendFromWeb()
	 * @see #unsetSendFromWeb()
	 * @see #setSendFromWeb(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getNotificationsConfig_SendFromWeb()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='send-from-web'"
	 * @generated
	 */
	boolean isSendFromWeb();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb <em>Send From Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send From Web</em>' attribute.
	 * @see #isSetSendFromWeb()
	 * @see #unsetSendFromWeb()
	 * @see #isSendFromWeb()
	 * @generated
	 */
	void setSendFromWeb(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb <em>Send From Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSendFromWeb()
	 * @see #isSendFromWeb()
	 * @see #setSendFromWeb(boolean)
	 * @generated
	 */
	void unsetSendFromWeb();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig#isSendFromWeb <em>Send From Web</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Send From Web</em>' attribute is set.
	 * @see #unsetSendFromWeb()
	 * @see #isSendFromWeb()
	 * @see #setSendFromWeb(boolean)
	 * @generated
	 */
	boolean isSetSendFromWeb();

} // NotificationsConfig
