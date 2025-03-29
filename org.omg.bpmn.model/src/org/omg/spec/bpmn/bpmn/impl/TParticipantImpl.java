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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TParticipant;
import org.omg.spec.bpmn.bpmn.TParticipantMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParticipant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl#getEndPointRef <em>End Point Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TParticipantImpl extends TBaseElementImpl implements TParticipant {
	/**
	 * The cached value of the '{@link #getInterfaceRef() <em>Interface Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> interfaceRef;

	/**
	 * The cached value of the '{@link #getEndPointRef() <em>End Point Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointRef()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> endPointRef;

	/**
	 * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected TParticipantMultiplicity participantMultiplicity;

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
	 * The default value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName PROCESS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected QName processRef = PROCESS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getInterfaceRef() {
		if (interfaceRef == null) {
			interfaceRef = new EDataTypeEList<QName>(QName.class, this, BPMNPackage.TPARTICIPANT__INTERFACE_REF);
		}
		return interfaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getEndPointRef() {
		if (endPointRef == null) {
			endPointRef = new EDataTypeEList<QName>(QName.class, this, BPMNPackage.TPARTICIPANT__END_POINT_REF);
		}
		return endPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipantMultiplicity getParticipantMultiplicity() {
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(TParticipantMultiplicity newParticipantMultiplicity, NotificationChain msgs) {
		TParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
		participantMultiplicity = newParticipantMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY, oldParticipantMultiplicity, newParticipantMultiplicity);
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
	public void setParticipantMultiplicity(TParticipantMultiplicity newParticipantMultiplicity) {
		if (newParticipantMultiplicity != participantMultiplicity) {
			NotificationChain msgs = null;
			if (participantMultiplicity != null)
				msgs = ((InternalEObject)participantMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY, null, msgs);
			if (newParticipantMultiplicity != null)
				msgs = ((InternalEObject)newParticipantMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY, null, msgs);
			msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY, newParticipantMultiplicity, newParticipantMultiplicity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessRef(QName newProcessRef) {
		QName oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT__PROCESS_REF, oldProcessRef, processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return basicSetParticipantMultiplicity(null, msgs);
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
			case BPMNPackage.TPARTICIPANT__INTERFACE_REF:
				return getInterfaceRef();
			case BPMNPackage.TPARTICIPANT__END_POINT_REF:
				return getEndPointRef();
			case BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return getParticipantMultiplicity();
			case BPMNPackage.TPARTICIPANT__NAME:
				return getName();
			case BPMNPackage.TPARTICIPANT__PROCESS_REF:
				return getProcessRef();
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
			case BPMNPackage.TPARTICIPANT__INTERFACE_REF:
				getInterfaceRef().clear();
				getInterfaceRef().addAll((Collection<? extends QName>)newValue);
				return;
			case BPMNPackage.TPARTICIPANT__END_POINT_REF:
				getEndPointRef().clear();
				getEndPointRef().addAll((Collection<? extends QName>)newValue);
				return;
			case BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((TParticipantMultiplicity)newValue);
				return;
			case BPMNPackage.TPARTICIPANT__NAME:
				setName((String)newValue);
				return;
			case BPMNPackage.TPARTICIPANT__PROCESS_REF:
				setProcessRef((QName)newValue);
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
			case BPMNPackage.TPARTICIPANT__INTERFACE_REF:
				getInterfaceRef().clear();
				return;
			case BPMNPackage.TPARTICIPANT__END_POINT_REF:
				getEndPointRef().clear();
				return;
			case BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((TParticipantMultiplicity)null);
				return;
			case BPMNPackage.TPARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMNPackage.TPARTICIPANT__PROCESS_REF:
				setProcessRef(PROCESS_REF_EDEFAULT);
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
			case BPMNPackage.TPARTICIPANT__INTERFACE_REF:
				return interfaceRef != null && !interfaceRef.isEmpty();
			case BPMNPackage.TPARTICIPANT__END_POINT_REF:
				return endPointRef != null && !endPointRef.isEmpty();
			case BPMNPackage.TPARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return participantMultiplicity != null;
			case BPMNPackage.TPARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMNPackage.TPARTICIPANT__PROCESS_REF:
				return PROCESS_REF_EDEFAULT == null ? processRef != null : !PROCESS_REF_EDEFAULT.equals(processRef);
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
		result.append(" (interfaceRef: ");
		result.append(interfaceRef);
		result.append(", endPointRef: ");
		result.append(endPointRef);
		result.append(", name: ");
		result.append(name);
		result.append(", processRef: ");
		result.append(processRef);
		result.append(')');
		return result.toString();
	}

} //TParticipantImpl
