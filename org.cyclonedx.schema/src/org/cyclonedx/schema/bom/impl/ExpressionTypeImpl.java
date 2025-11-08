/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ExpressionType;
import org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ExpressionTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ExpressionTypeImpl#getAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ExpressionTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionTypeImpl extends MinimalEObjectImpl.Container implements ExpressionType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgement()
	 * @generated
	 * @ordered
	 */
	protected static final LicenseAcknowledgementEnumerationType ACKNOWLEDGEMENT_EDEFAULT = LicenseAcknowledgementEnumerationType.DECLARED;

	/**
	 * The cached value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgement()
	 * @generated
	 * @ordered
	 */
	protected LicenseAcknowledgementEnumerationType acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;

	/**
	 * This is true if the Acknowledgement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acknowledgementESet;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getExpressionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EXPRESSION_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseAcknowledgementEnumerationType getAcknowledgement() {
		return acknowledgement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcknowledgement(LicenseAcknowledgementEnumerationType newAcknowledgement) {
		LicenseAcknowledgementEnumerationType oldAcknowledgement = acknowledgement;
		acknowledgement = newAcknowledgement == null ? ACKNOWLEDGEMENT_EDEFAULT : newAcknowledgement;
		boolean oldAcknowledgementESet = acknowledgementESet;
		acknowledgementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT, oldAcknowledgement, acknowledgement, !oldAcknowledgementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAcknowledgement() {
		LicenseAcknowledgementEnumerationType oldAcknowledgement = acknowledgement;
		boolean oldAcknowledgementESet = acknowledgementESet;
		acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;
		acknowledgementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT, oldAcknowledgement, ACKNOWLEDGEMENT_EDEFAULT, oldAcknowledgementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAcknowledgement() {
		return acknowledgementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EXPRESSION_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.EXPRESSION_TYPE__VALUE:
				return getValue();
			case BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT:
				return getAcknowledgement();
			case BOMPackage.EXPRESSION_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.EXPRESSION_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT:
				setAcknowledgement((LicenseAcknowledgementEnumerationType)newValue);
				return;
			case BOMPackage.EXPRESSION_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.EXPRESSION_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT:
				unsetAcknowledgement();
				return;
			case BOMPackage.EXPRESSION_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.EXPRESSION_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BOMPackage.EXPRESSION_TYPE__ACKNOWLEDGEMENT:
				return isSetAcknowledgement();
			case BOMPackage.EXPRESSION_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", acknowledgement: ");
		if (acknowledgementESet) result.append(acknowledgement); else result.append("<unset>");
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //ExpressionTypeImpl
