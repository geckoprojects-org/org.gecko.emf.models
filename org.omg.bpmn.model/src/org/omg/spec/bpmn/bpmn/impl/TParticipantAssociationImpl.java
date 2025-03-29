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
import org.omg.spec.bpmn.bpmn.TParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParticipant Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantAssociationImpl#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TParticipantAssociationImpl#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TParticipantAssociationImpl extends TBaseElementImpl implements TParticipantAssociation {
	/**
	 * The default value of the '{@link #getInnerParticipantRef() <em>Inner Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName INNER_PARTICIPANT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerParticipantRef() <em>Inner Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected QName innerParticipantRef = INNER_PARTICIPANT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterParticipantRef() <em>Outer Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName OUTER_PARTICIPANT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuterParticipantRef() <em>Outer Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected QName outerParticipantRef = OUTER_PARTICIPANT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TParticipantAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTParticipantAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getInnerParticipantRef() {
		return innerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerParticipantRef(QName newInnerParticipantRef) {
		QName oldInnerParticipantRef = innerParticipantRef;
		innerParticipantRef = newInnerParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, oldInnerParticipantRef, innerParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getOuterParticipantRef() {
		return outerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterParticipantRef(QName newOuterParticipantRef) {
		QName oldOuterParticipantRef = outerParticipantRef;
		outerParticipantRef = newOuterParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, oldOuterParticipantRef, outerParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				return getInnerParticipantRef();
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				return getOuterParticipantRef();
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
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				setInnerParticipantRef((QName)newValue);
				return;
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				setOuterParticipantRef((QName)newValue);
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
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				setInnerParticipantRef(INNER_PARTICIPANT_REF_EDEFAULT);
				return;
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				setOuterParticipantRef(OUTER_PARTICIPANT_REF_EDEFAULT);
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
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				return INNER_PARTICIPANT_REF_EDEFAULT == null ? innerParticipantRef != null : !INNER_PARTICIPANT_REF_EDEFAULT.equals(innerParticipantRef);
			case BPMNPackage.TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				return OUTER_PARTICIPANT_REF_EDEFAULT == null ? outerParticipantRef != null : !OUTER_PARTICIPANT_REF_EDEFAULT.equals(outerParticipantRef);
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
		result.append(" (innerParticipantRef: ");
		result.append(innerParticipantRef);
		result.append(", outerParticipantRef: ");
		result.append(outerParticipantRef);
		result.append(')');
		return result.toString();
	}

} //TParticipantAssociationImpl
