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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDStandardOrderProcessType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Standard Order Process Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDStandardOrderProcessTypeImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDStandardOrderProcessTypeImpl#getPlannedAvailableDateTime <em>Planned Available Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDStandardOrderProcessTypeImpl#getOrderingInstructions <em>Ordering Instructions</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDStandardOrderProcessTypeImpl#getTurnaround <em>Turnaround</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDStandardOrderProcessTypeImpl extends AbstractObjectTypeImpl implements MDStandardOrderProcessType {
	/**
	 * The cached value of the '{@link #getFees() <em>Fees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fees;

	/**
	 * The cached value of the '{@link #getPlannedAvailableDateTime() <em>Planned Available Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedAvailableDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTimePropertyType plannedAvailableDateTime;

	/**
	 * The cached value of the '{@link #getOrderingInstructions() <em>Ordering Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderingInstructions()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType orderingInstructions;

	/**
	 * The cached value of the '{@link #getTurnaround() <em>Turnaround</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnaround()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType turnaround;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDStandardOrderProcessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDStandardOrderProcessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFees() {
		return fees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFees(CharacterStringPropertyType newFees, NotificationChain msgs) {
		CharacterStringPropertyType oldFees = fees;
		fees = newFees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES, oldFees, newFees);
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
	public void setFees(CharacterStringPropertyType newFees) {
		if (newFees != fees) {
			NotificationChain msgs = null;
			if (fees != null)
				msgs = ((InternalEObject)fees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES, null, msgs);
			if (newFees != null)
				msgs = ((InternalEObject)newFees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES, null, msgs);
			msgs = basicSetFees(newFees, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES, newFees, newFees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimePropertyType getPlannedAvailableDateTime() {
		return plannedAvailableDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedAvailableDateTime(DateTimePropertyType newPlannedAvailableDateTime, NotificationChain msgs) {
		DateTimePropertyType oldPlannedAvailableDateTime = plannedAvailableDateTime;
		plannedAvailableDateTime = newPlannedAvailableDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME, oldPlannedAvailableDateTime, newPlannedAvailableDateTime);
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
	public void setPlannedAvailableDateTime(DateTimePropertyType newPlannedAvailableDateTime) {
		if (newPlannedAvailableDateTime != plannedAvailableDateTime) {
			NotificationChain msgs = null;
			if (plannedAvailableDateTime != null)
				msgs = ((InternalEObject)plannedAvailableDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME, null, msgs);
			if (newPlannedAvailableDateTime != null)
				msgs = ((InternalEObject)newPlannedAvailableDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME, null, msgs);
			msgs = basicSetPlannedAvailableDateTime(newPlannedAvailableDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME, newPlannedAvailableDateTime, newPlannedAvailableDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getOrderingInstructions() {
		return orderingInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderingInstructions(CharacterStringPropertyType newOrderingInstructions, NotificationChain msgs) {
		CharacterStringPropertyType oldOrderingInstructions = orderingInstructions;
		orderingInstructions = newOrderingInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS, oldOrderingInstructions, newOrderingInstructions);
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
	public void setOrderingInstructions(CharacterStringPropertyType newOrderingInstructions) {
		if (newOrderingInstructions != orderingInstructions) {
			NotificationChain msgs = null;
			if (orderingInstructions != null)
				msgs = ((InternalEObject)orderingInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS, null, msgs);
			if (newOrderingInstructions != null)
				msgs = ((InternalEObject)newOrderingInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS, null, msgs);
			msgs = basicSetOrderingInstructions(newOrderingInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS, newOrderingInstructions, newOrderingInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getTurnaround() {
		return turnaround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnaround(CharacterStringPropertyType newTurnaround, NotificationChain msgs) {
		CharacterStringPropertyType oldTurnaround = turnaround;
		turnaround = newTurnaround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND, oldTurnaround, newTurnaround);
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
	public void setTurnaround(CharacterStringPropertyType newTurnaround) {
		if (newTurnaround != turnaround) {
			NotificationChain msgs = null;
			if (turnaround != null)
				msgs = ((InternalEObject)turnaround).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND, null, msgs);
			if (newTurnaround != null)
				msgs = ((InternalEObject)newTurnaround).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND, null, msgs);
			msgs = basicSetTurnaround(newTurnaround, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND, newTurnaround, newTurnaround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES:
				return basicSetFees(null, msgs);
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME:
				return basicSetPlannedAvailableDateTime(null, msgs);
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS:
				return basicSetOrderingInstructions(null, msgs);
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND:
				return basicSetTurnaround(null, msgs);
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
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES:
				return getFees();
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME:
				return getPlannedAvailableDateTime();
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS:
				return getOrderingInstructions();
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND:
				return getTurnaround();
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
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES:
				setFees((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME:
				setPlannedAvailableDateTime((DateTimePropertyType)newValue);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS:
				setOrderingInstructions((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND:
				setTurnaround((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES:
				setFees((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME:
				setPlannedAvailableDateTime((DateTimePropertyType)null);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS:
				setOrderingInstructions((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND:
				setTurnaround((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__FEES:
				return fees != null;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__PLANNED_AVAILABLE_DATE_TIME:
				return plannedAvailableDateTime != null;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__ORDERING_INSTRUCTIONS:
				return orderingInstructions != null;
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE__TURNAROUND:
				return turnaround != null;
		}
		return super.eIsSet(featureID);
	}

} //MDStandardOrderProcessTypeImpl
