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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TEscalation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEscalation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TEscalationImpl#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TEscalationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TEscalationImpl#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEscalationImpl extends TRootElementImpl implements TEscalation {
	/**
	 * The default value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCALATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected String escalationCode = ESCALATION_CODE_EDEFAULT;

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
	 * The default value of the '{@link #getStructureRef() <em>Structure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName STRUCTURE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected QName structureRef = STRUCTURE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEscalationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTEscalation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscalationCode() {
		return escalationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscalationCode(String newEscalationCode) {
		String oldEscalationCode = escalationCode;
		escalationCode = newEscalationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TESCALATION__ESCALATION_CODE, oldEscalationCode, escalationCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TESCALATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getStructureRef() {
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructureRef(QName newStructureRef) {
		QName oldStructureRef = structureRef;
		structureRef = newStructureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TESCALATION__STRUCTURE_REF, oldStructureRef, structureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TESCALATION__ESCALATION_CODE:
				return getEscalationCode();
			case BPMNPackage.TESCALATION__NAME:
				return getName();
			case BPMNPackage.TESCALATION__STRUCTURE_REF:
				return getStructureRef();
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
			case BPMNPackage.TESCALATION__ESCALATION_CODE:
				setEscalationCode((String)newValue);
				return;
			case BPMNPackage.TESCALATION__NAME:
				setName((String)newValue);
				return;
			case BPMNPackage.TESCALATION__STRUCTURE_REF:
				setStructureRef((QName)newValue);
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
			case BPMNPackage.TESCALATION__ESCALATION_CODE:
				setEscalationCode(ESCALATION_CODE_EDEFAULT);
				return;
			case BPMNPackage.TESCALATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMNPackage.TESCALATION__STRUCTURE_REF:
				setStructureRef(STRUCTURE_REF_EDEFAULT);
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
			case BPMNPackage.TESCALATION__ESCALATION_CODE:
				return ESCALATION_CODE_EDEFAULT == null ? escalationCode != null : !ESCALATION_CODE_EDEFAULT.equals(escalationCode);
			case BPMNPackage.TESCALATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMNPackage.TESCALATION__STRUCTURE_REF:
				return STRUCTURE_REF_EDEFAULT == null ? structureRef != null : !STRUCTURE_REF_EDEFAULT.equals(structureRef);
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
		result.append(" (escalationCode: ");
		result.append(escalationCode);
		result.append(", name: ");
		result.append(name);
		result.append(", structureRef: ");
		result.append(structureRef);
		result.append(')');
		return result.toString();
	}

} //TEscalationImpl
