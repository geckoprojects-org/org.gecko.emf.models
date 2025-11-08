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

import java.math.BigDecimal;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.IdentityFieldType;
import org.cyclonedx.schema.bom.IdentityType;
import org.cyclonedx.schema.bom.MethodsType;
import org.cyclonedx.schema.bom.ToolsType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl#getConcludedValue <em>Concluded Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.IdentityTypeImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityTypeImpl extends MinimalEObjectImpl.Container implements IdentityType {
	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final IdentityFieldType FIELD_EDEFAULT = IdentityFieldType.GROUP;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected IdentityFieldType field = FIELD_EDEFAULT;

	/**
	 * This is true if the Field attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldESet;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CONFIDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcludedValue() <em>Concluded Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcludedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUDED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcludedValue() <em>Concluded Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcludedValue()
	 * @generated
	 * @ordered
	 */
	protected String concludedValue = CONCLUDED_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected MethodsType methods;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected ToolsType2 tools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getIdentityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentityFieldType getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(IdentityFieldType newField) {
		IdentityFieldType oldField = field;
		field = newField == null ? FIELD_EDEFAULT : newField;
		boolean oldFieldESet = fieldESet;
		fieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__FIELD, oldField, field, !oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetField() {
		IdentityFieldType oldField = field;
		boolean oldFieldESet = fieldESet;
		field = FIELD_EDEFAULT;
		fieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.IDENTITY_TYPE__FIELD, oldField, FIELD_EDEFAULT, oldFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetField() {
		return fieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(BigDecimal newConfidence) {
		BigDecimal oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConcludedValue() {
		return concludedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcludedValue(String newConcludedValue) {
		String oldConcludedValue = concludedValue;
		concludedValue = newConcludedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__CONCLUDED_VALUE, oldConcludedValue, concludedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodsType getMethods() {
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethods(MethodsType newMethods, NotificationChain msgs) {
		MethodsType oldMethods = methods;
		methods = newMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__METHODS, oldMethods, newMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethods(MethodsType newMethods) {
		if (newMethods != methods) {
			NotificationChain msgs = null;
			if (methods != null)
				msgs = ((InternalEObject)methods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.IDENTITY_TYPE__METHODS, null, msgs);
			if (newMethods != null)
				msgs = ((InternalEObject)newMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.IDENTITY_TYPE__METHODS, null, msgs);
			msgs = basicSetMethods(newMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__METHODS, newMethods, newMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType2 getTools() {
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTools(ToolsType2 newTools, NotificationChain msgs) {
		ToolsType2 oldTools = tools;
		tools = newTools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__TOOLS, oldTools, newTools);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTools(ToolsType2 newTools) {
		if (newTools != tools) {
			NotificationChain msgs = null;
			if (tools != null)
				msgs = ((InternalEObject)tools).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.IDENTITY_TYPE__TOOLS, null, msgs);
			if (newTools != null)
				msgs = ((InternalEObject)newTools).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.IDENTITY_TYPE__TOOLS, null, msgs);
			msgs = basicSetTools(newTools, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.IDENTITY_TYPE__TOOLS, newTools, newTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.IDENTITY_TYPE__METHODS:
				return basicSetMethods(null, msgs);
			case BOMPackage.IDENTITY_TYPE__TOOLS:
				return basicSetTools(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.IDENTITY_TYPE__FIELD:
				return getField();
			case BOMPackage.IDENTITY_TYPE__CONFIDENCE:
				return getConfidence();
			case BOMPackage.IDENTITY_TYPE__CONCLUDED_VALUE:
				return getConcludedValue();
			case BOMPackage.IDENTITY_TYPE__METHODS:
				return getMethods();
			case BOMPackage.IDENTITY_TYPE__TOOLS:
				return getTools();
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
			case BOMPackage.IDENTITY_TYPE__FIELD:
				setField((IdentityFieldType)newValue);
				return;
			case BOMPackage.IDENTITY_TYPE__CONFIDENCE:
				setConfidence((BigDecimal)newValue);
				return;
			case BOMPackage.IDENTITY_TYPE__CONCLUDED_VALUE:
				setConcludedValue((String)newValue);
				return;
			case BOMPackage.IDENTITY_TYPE__METHODS:
				setMethods((MethodsType)newValue);
				return;
			case BOMPackage.IDENTITY_TYPE__TOOLS:
				setTools((ToolsType2)newValue);
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
			case BOMPackage.IDENTITY_TYPE__FIELD:
				unsetField();
				return;
			case BOMPackage.IDENTITY_TYPE__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case BOMPackage.IDENTITY_TYPE__CONCLUDED_VALUE:
				setConcludedValue(CONCLUDED_VALUE_EDEFAULT);
				return;
			case BOMPackage.IDENTITY_TYPE__METHODS:
				setMethods((MethodsType)null);
				return;
			case BOMPackage.IDENTITY_TYPE__TOOLS:
				setTools((ToolsType2)null);
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
			case BOMPackage.IDENTITY_TYPE__FIELD:
				return isSetField();
			case BOMPackage.IDENTITY_TYPE__CONFIDENCE:
				return CONFIDENCE_EDEFAULT == null ? confidence != null : !CONFIDENCE_EDEFAULT.equals(confidence);
			case BOMPackage.IDENTITY_TYPE__CONCLUDED_VALUE:
				return CONCLUDED_VALUE_EDEFAULT == null ? concludedValue != null : !CONCLUDED_VALUE_EDEFAULT.equals(concludedValue);
			case BOMPackage.IDENTITY_TYPE__METHODS:
				return methods != null;
			case BOMPackage.IDENTITY_TYPE__TOOLS:
				return tools != null;
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
		result.append(" (field: ");
		if (fieldESet) result.append(field); else result.append("<unset>");
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", concludedValue: ");
		result.append(concludedValue);
		result.append(')');
		return result.toString();
	}

} //IdentityTypeImpl
