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
import org.emau.icmvc.ganimed.ttp.cm2.config.ScansConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scans Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.ScansConfigImpl#getSizeLimit <em>Size Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScansConfigImpl extends MinimalEObjectImpl.Container implements ScansConfig {
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * This is true if the Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryESet;

	/**
	 * The default value of the '{@link #getSizeLimit() <em>Size Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeLimit() <em>Size Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLimit()
	 * @generated
	 * @ordered
	 */
	protected int sizeLimit = SIZE_LIMIT_EDEFAULT;

	/**
	 * This is true if the Size Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeLimitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScansConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.SCANS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCANS_CONFIG__MANDATORY, oldMandatory, mandatory, !oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMandatory() {
		boolean oldMandatory = mandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatory = MANDATORY_EDEFAULT;
		mandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.SCANS_CONFIG__MANDATORY, oldMandatory, MANDATORY_EDEFAULT, oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMandatory() {
		return mandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeLimit() {
		return sizeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeLimit(int newSizeLimit) {
		int oldSizeLimit = sizeLimit;
		sizeLimit = newSizeLimit;
		boolean oldSizeLimitESet = sizeLimitESet;
		sizeLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCANS_CONFIG__SIZE_LIMIT, oldSizeLimit, sizeLimit, !oldSizeLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSizeLimit() {
		int oldSizeLimit = sizeLimit;
		boolean oldSizeLimitESet = sizeLimitESet;
		sizeLimit = SIZE_LIMIT_EDEFAULT;
		sizeLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.SCANS_CONFIG__SIZE_LIMIT, oldSizeLimit, SIZE_LIMIT_EDEFAULT, oldSizeLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSizeLimit() {
		return sizeLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.SCANS_CONFIG__MANDATORY:
				return isMandatory();
			case ConfigPackage.SCANS_CONFIG__SIZE_LIMIT:
				return getSizeLimit();
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
			case ConfigPackage.SCANS_CONFIG__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case ConfigPackage.SCANS_CONFIG__SIZE_LIMIT:
				setSizeLimit((Integer)newValue);
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
			case ConfigPackage.SCANS_CONFIG__MANDATORY:
				unsetMandatory();
				return;
			case ConfigPackage.SCANS_CONFIG__SIZE_LIMIT:
				unsetSizeLimit();
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
			case ConfigPackage.SCANS_CONFIG__MANDATORY:
				return isSetMandatory();
			case ConfigPackage.SCANS_CONFIG__SIZE_LIMIT:
				return isSetSizeLimit();
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
		result.append(" (mandatory: ");
		if (mandatoryESet) result.append(mandatory); else result.append("<unset>");
		result.append(", sizeLimit: ");
		if (sizeLimitESet) result.append(sizeLimit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScansConfigImpl
