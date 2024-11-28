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
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.NotificationsConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notifications Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.NotificationsConfigImpl#isSendFromWeb <em>Send From Web</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationsConfigImpl extends MinimalEObjectImpl.Container implements NotificationsConfig {
	/**
	 * The default value of the '{@link #isSendFromWeb() <em>Send From Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendFromWeb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_FROM_WEB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSendFromWeb() <em>Send From Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendFromWeb()
	 * @generated
	 * @ordered
	 */
	protected boolean sendFromWeb = SEND_FROM_WEB_EDEFAULT;

	/**
	 * This is true if the Send From Web attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sendFromWebESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.NOTIFICATIONS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSendFromWeb() {
		return sendFromWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendFromWeb(boolean newSendFromWeb) {
		boolean oldSendFromWeb = sendFromWeb;
		sendFromWeb = newSendFromWeb;
		boolean oldSendFromWebESet = sendFromWebESet;
		sendFromWebESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB, oldSendFromWeb, sendFromWeb, !oldSendFromWebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSendFromWeb() {
		boolean oldSendFromWeb = sendFromWeb;
		boolean oldSendFromWebESet = sendFromWebESet;
		sendFromWeb = SEND_FROM_WEB_EDEFAULT;
		sendFromWebESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB, oldSendFromWeb, SEND_FROM_WEB_EDEFAULT, oldSendFromWebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSendFromWeb() {
		return sendFromWebESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB:
				return isSendFromWeb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB:
				setSendFromWeb((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB:
				unsetSendFromWeb();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.NOTIFICATIONS_CONFIG__SEND_FROM_WEB:
				return isSetSendFromWeb();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sendFromWeb: ");
		if (sendFromWebESet) result.append(sendFromWeb); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NotificationsConfigImpl
