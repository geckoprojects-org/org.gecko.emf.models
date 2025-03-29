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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TLiteralExpression;
import org.omg.spec.dmn.dmn.TOutputClause;
import org.omg.spec.dmn.dmn.TUnaryTests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOutput Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl#getOutputValues <em>Output Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl#getDefaultOutputEntry <em>Default Output Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOutputClauseImpl extends TDMNElementImpl implements TOutputClause {
	/**
	 * The cached value of the '{@link #getOutputValues() <em>Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValues()
	 * @generated
	 * @ordered
	 */
	protected TUnaryTests outputValues;

	/**
	 * The cached value of the '{@link #getDefaultOutputEntry() <em>Default Output Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutputEntry()
	 * @generated
	 * @ordered
	 */
	protected TLiteralExpression defaultOutputEntry;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String typeRef = TYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOutputClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TOUTPUT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnaryTests getOutputValues() {
		return outputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputValues(TUnaryTests newOutputValues, NotificationChain msgs) {
		TUnaryTests oldOutputValues = outputValues;
		outputValues = newOutputValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES, oldOutputValues, newOutputValues);
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
	public void setOutputValues(TUnaryTests newOutputValues) {
		if (newOutputValues != outputValues) {
			NotificationChain msgs = null;
			if (outputValues != null)
				msgs = ((InternalEObject)outputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES, null, msgs);
			if (newOutputValues != null)
				msgs = ((InternalEObject)newOutputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES, null, msgs);
			msgs = basicSetOutputValues(newOutputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES, newOutputValues, newOutputValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLiteralExpression getDefaultOutputEntry() {
		return defaultOutputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultOutputEntry(TLiteralExpression newDefaultOutputEntry, NotificationChain msgs) {
		TLiteralExpression oldDefaultOutputEntry = defaultOutputEntry;
		defaultOutputEntry = newDefaultOutputEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, oldDefaultOutputEntry, newDefaultOutputEntry);
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
	public void setDefaultOutputEntry(TLiteralExpression newDefaultOutputEntry) {
		if (newDefaultOutputEntry != defaultOutputEntry) {
			NotificationChain msgs = null;
			if (defaultOutputEntry != null)
				msgs = ((InternalEObject)defaultOutputEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, null, msgs);
			if (newDefaultOutputEntry != null)
				msgs = ((InternalEObject)newDefaultOutputEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, null, msgs);
			msgs = basicSetDefaultOutputEntry(newDefaultOutputEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY, newDefaultOutputEntry, newDefaultOutputEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeRef(String newTypeRef) {
		String oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TOUTPUT_CLAUSE__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES:
				return basicSetOutputValues(null, msgs);
			case DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return basicSetDefaultOutputEntry(null, msgs);
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
			case DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES:
				return getOutputValues();
			case DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return getDefaultOutputEntry();
			case DMNPackage.TOUTPUT_CLAUSE__NAME:
				return getName();
			case DMNPackage.TOUTPUT_CLAUSE__TYPE_REF:
				return getTypeRef();
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
			case DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES:
				setOutputValues((TUnaryTests)newValue);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				setDefaultOutputEntry((TLiteralExpression)newValue);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__NAME:
				setName((String)newValue);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__TYPE_REF:
				setTypeRef((String)newValue);
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
			case DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES:
				setOutputValues((TUnaryTests)null);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				setDefaultOutputEntry((TLiteralExpression)null);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DMNPackage.TOUTPUT_CLAUSE__TYPE_REF:
				setTypeRef(TYPE_REF_EDEFAULT);
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
			case DMNPackage.TOUTPUT_CLAUSE__OUTPUT_VALUES:
				return outputValues != null;
			case DMNPackage.TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY:
				return defaultOutputEntry != null;
			case DMNPackage.TOUTPUT_CLAUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DMNPackage.TOUTPUT_CLAUSE__TYPE_REF:
				return TYPE_REF_EDEFAULT == null ? typeRef != null : !TYPE_REF_EDEFAULT.equals(typeRef);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", typeRef: ");
		result.append(typeRef);
		result.append(')');
		return result.toString();
	}

} //TOutputClauseImpl
