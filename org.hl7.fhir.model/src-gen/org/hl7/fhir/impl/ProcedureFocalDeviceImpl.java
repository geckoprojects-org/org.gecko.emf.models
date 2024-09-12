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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureFocalDeviceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureFocalDeviceImpl#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureFocalDeviceImpl extends BackboneElementImpl implements ProcedureFocalDevice {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept action;

	/**
	 * The cached value of the '{@link #getManipulated() <em>Manipulated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulated()
	 * @generated
	 * @ordered
	 */
	protected Reference manipulated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureFocalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getProcedureFocalDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CodeableConcept newAction, NotificationChain msgs) {
		CodeableConcept oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION, oldAction, newAction);
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
	public void setAction(CodeableConcept newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManipulated() {
		return manipulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManipulated(Reference newManipulated, NotificationChain msgs) {
		Reference oldManipulated = manipulated;
		manipulated = newManipulated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, oldManipulated, newManipulated);
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
	public void setManipulated(Reference newManipulated) {
		if (newManipulated != manipulated) {
			NotificationChain msgs = null;
			if (manipulated != null)
				msgs = ((InternalEObject)manipulated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, null, msgs);
			if (newManipulated != null)
				msgs = ((InternalEObject)newManipulated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, null, msgs);
			msgs = basicSetManipulated(newManipulated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, newManipulated, newManipulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				return basicSetAction(null, msgs);
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				return basicSetManipulated(null, msgs);
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
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				return getAction();
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				return getManipulated();
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
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				setAction((CodeableConcept)newValue);
				return;
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				setManipulated((Reference)newValue);
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
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				setAction((CodeableConcept)null);
				return;
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				setManipulated((Reference)null);
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
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				return action != null;
			case FHIRPackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				return manipulated != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureFocalDeviceImpl
