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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TInputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInput Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInputSetImpl extends TBaseElementImpl implements TInputSet {
	/**
	 * The cached value of the '{@link #getDataInputRefs() <em>Data Input Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInputRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataInputRefs;

	/**
	 * The cached value of the '{@link #getOptionalInputRefs() <em>Optional Input Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalInputRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> optionalInputRefs;

	/**
	 * The cached value of the '{@link #getWhileExecutingInputRefs() <em>While Executing Input Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileExecutingInputRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> whileExecutingInputRefs;

	/**
	 * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSetRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputSetRefs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTInputSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDataInputRefs() {
		if (dataInputRefs == null) {
			dataInputRefs = new EDataTypeEList<String>(String.class, this, BPMNPackage.TINPUT_SET__DATA_INPUT_REFS);
		}
		return dataInputRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOptionalInputRefs() {
		if (optionalInputRefs == null) {
			optionalInputRefs = new EDataTypeEList<String>(String.class, this, BPMNPackage.TINPUT_SET__OPTIONAL_INPUT_REFS);
		}
		return optionalInputRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWhileExecutingInputRefs() {
		if (whileExecutingInputRefs == null) {
			whileExecutingInputRefs = new EDataTypeEList<String>(String.class, this, BPMNPackage.TINPUT_SET__WHILE_EXECUTING_INPUT_REFS);
		}
		return whileExecutingInputRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOutputSetRefs() {
		if (outputSetRefs == null) {
			outputSetRefs = new EDataTypeEList<String>(String.class, this, BPMNPackage.TINPUT_SET__OUTPUT_SET_REFS);
		}
		return outputSetRefs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TINPUT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TINPUT_SET__DATA_INPUT_REFS:
				return getDataInputRefs();
			case BPMNPackage.TINPUT_SET__OPTIONAL_INPUT_REFS:
				return getOptionalInputRefs();
			case BPMNPackage.TINPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return getWhileExecutingInputRefs();
			case BPMNPackage.TINPUT_SET__OUTPUT_SET_REFS:
				return getOutputSetRefs();
			case BPMNPackage.TINPUT_SET__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMNPackage.TINPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
				getDataInputRefs().addAll((Collection<? extends String>)newValue);
				return;
			case BPMNPackage.TINPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				getOptionalInputRefs().addAll((Collection<? extends String>)newValue);
				return;
			case BPMNPackage.TINPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				getWhileExecutingInputRefs().addAll((Collection<? extends String>)newValue);
				return;
			case BPMNPackage.TINPUT_SET__OUTPUT_SET_REFS:
				getOutputSetRefs().clear();
				getOutputSetRefs().addAll((Collection<? extends String>)newValue);
				return;
			case BPMNPackage.TINPUT_SET__NAME:
				setName((String)newValue);
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
			case BPMNPackage.TINPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
				return;
			case BPMNPackage.TINPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				return;
			case BPMNPackage.TINPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				return;
			case BPMNPackage.TINPUT_SET__OUTPUT_SET_REFS:
				getOutputSetRefs().clear();
				return;
			case BPMNPackage.TINPUT_SET__NAME:
				setName(NAME_EDEFAULT);
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
			case BPMNPackage.TINPUT_SET__DATA_INPUT_REFS:
				return dataInputRefs != null && !dataInputRefs.isEmpty();
			case BPMNPackage.TINPUT_SET__OPTIONAL_INPUT_REFS:
				return optionalInputRefs != null && !optionalInputRefs.isEmpty();
			case BPMNPackage.TINPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return whileExecutingInputRefs != null && !whileExecutingInputRefs.isEmpty();
			case BPMNPackage.TINPUT_SET__OUTPUT_SET_REFS:
				return outputSetRefs != null && !outputSetRefs.isEmpty();
			case BPMNPackage.TINPUT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (dataInputRefs: ");
		result.append(dataInputRefs);
		result.append(", optionalInputRefs: ");
		result.append(optionalInputRefs);
		result.append(", whileExecutingInputRefs: ");
		result.append(whileExecutingInputRefs);
		result.append(", outputSetRefs: ");
		result.append(outputSetRefs);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TInputSetImpl
