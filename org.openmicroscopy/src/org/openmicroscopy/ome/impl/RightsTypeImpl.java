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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.RightsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rights Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.RightsTypeImpl#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.RightsTypeImpl#getRightsHeld <em>Rights Held</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightsTypeImpl extends MinimalEObjectImpl.Container implements RightsType {
	/**
	 * The default value of the '{@link #getRightsHolder() <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_HOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightsHolder() <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHolder()
	 * @generated
	 * @ordered
	 */
	protected String rightsHolder = RIGHTS_HOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightsHeld() <em>Rights Held</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHeld()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_HELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightsHeld() <em>Rights Held</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHeld()
	 * @generated
	 * @ordered
	 */
	protected String rightsHeld = RIGHTS_HELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getRightsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightsHolder() {
		return rightsHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightsHolder(String newRightsHolder) {
		String oldRightsHolder = rightsHolder;
		rightsHolder = newRightsHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.RIGHTS_TYPE__RIGHTS_HOLDER, oldRightsHolder, rightsHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightsHeld() {
		return rightsHeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightsHeld(String newRightsHeld) {
		String oldRightsHeld = rightsHeld;
		rightsHeld = newRightsHeld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.RIGHTS_TYPE__RIGHTS_HELD, oldRightsHeld, rightsHeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HOLDER:
				return getRightsHolder();
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HELD:
				return getRightsHeld();
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
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HOLDER:
				setRightsHolder((String)newValue);
				return;
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HELD:
				setRightsHeld((String)newValue);
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
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HOLDER:
				setRightsHolder(RIGHTS_HOLDER_EDEFAULT);
				return;
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HELD:
				setRightsHeld(RIGHTS_HELD_EDEFAULT);
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
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HOLDER:
				return RIGHTS_HOLDER_EDEFAULT == null ? rightsHolder != null : !RIGHTS_HOLDER_EDEFAULT.equals(rightsHolder);
			case OMEPackage.RIGHTS_TYPE__RIGHTS_HELD:
				return RIGHTS_HELD_EDEFAULT == null ? rightsHeld != null : !RIGHTS_HELD_EDEFAULT.equals(rightsHeld);
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
		result.append(" (rightsHolder: ");
		result.append(rightsHolder);
		result.append(", rightsHeld: ");
		result.append(rightsHeld);
		result.append(')');
		return result.toString();
	}

} //RightsTypeImpl
