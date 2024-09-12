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

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ServiceRequestPatientInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Request Patient Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ServiceRequestPatientInstructionImpl#getInstructionMarkdown <em>Instruction Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ServiceRequestPatientInstructionImpl#getInstructionReference <em>Instruction Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRequestPatientInstructionImpl extends BackboneElementImpl implements ServiceRequestPatientInstruction {
	/**
	 * The cached value of the '{@link #getInstructionMarkdown() <em>Instruction Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown instructionMarkdown;

	/**
	 * The cached value of the '{@link #getInstructionReference() <em>Instruction Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference instructionReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequestPatientInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getServiceRequestPatientInstruction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getInstructionMarkdown() {
		return instructionMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionMarkdown(Markdown newInstructionMarkdown, NotificationChain msgs) {
		Markdown oldInstructionMarkdown = instructionMarkdown;
		instructionMarkdown = newInstructionMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN, oldInstructionMarkdown, newInstructionMarkdown);
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
	public void setInstructionMarkdown(Markdown newInstructionMarkdown) {
		if (newInstructionMarkdown != instructionMarkdown) {
			NotificationChain msgs = null;
			if (instructionMarkdown != null)
				msgs = ((InternalEObject)instructionMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN, null, msgs);
			if (newInstructionMarkdown != null)
				msgs = ((InternalEObject)newInstructionMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN, null, msgs);
			msgs = basicSetInstructionMarkdown(newInstructionMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN, newInstructionMarkdown, newInstructionMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInstructionReference() {
		return instructionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionReference(Reference newInstructionReference, NotificationChain msgs) {
		Reference oldInstructionReference = instructionReference;
		instructionReference = newInstructionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE, oldInstructionReference, newInstructionReference);
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
	public void setInstructionReference(Reference newInstructionReference) {
		if (newInstructionReference != instructionReference) {
			NotificationChain msgs = null;
			if (instructionReference != null)
				msgs = ((InternalEObject)instructionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE, null, msgs);
			if (newInstructionReference != null)
				msgs = ((InternalEObject)newInstructionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE, null, msgs);
			msgs = basicSetInstructionReference(newInstructionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE, newInstructionReference, newInstructionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN:
				return basicSetInstructionMarkdown(null, msgs);
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE:
				return basicSetInstructionReference(null, msgs);
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
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN:
				return getInstructionMarkdown();
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE:
				return getInstructionReference();
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
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN:
				setInstructionMarkdown((Markdown)newValue);
				return;
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE:
				setInstructionReference((Reference)newValue);
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
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN:
				setInstructionMarkdown((Markdown)null);
				return;
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE:
				setInstructionReference((Reference)null);
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
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_MARKDOWN:
				return instructionMarkdown != null;
			case FHIRPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION__INSTRUCTION_REFERENCE:
				return instructionReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceRequestPatientInstructionImpl
