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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.SubstancePolymerStructuralRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Structural Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerStructuralRepresentationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerStructuralRepresentationImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerStructuralRepresentationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerStructuralRepresentationImpl#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerStructuralRepresentationImpl extends BackboneElementImpl implements SubstancePolymerStructuralRepresentation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String representation;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept format;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerStructuralRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSubstancePolymerStructuralRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(org.hl7.fhir.String newRepresentation, NotificationChain msgs) {
		org.hl7.fhir.String oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION, oldRepresentation, newRepresentation);
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
	public void setRepresentation(org.hl7.fhir.String newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject)representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject)newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION, newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(CodeableConcept newFormat, NotificationChain msgs) {
		CodeableConcept oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT, oldFormat, newFormat);
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
	public void setFormat(CodeableConcept newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT, newFormat, newFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(Attachment newAttachment, NotificationChain msgs) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT, oldAttachment, newAttachment);
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
	public void setAttachment(Attachment newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject)attachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject)newAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT, newAttachment, newAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT:
				return basicSetFormat(null, msgs);
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT:
				return basicSetAttachment(null, msgs);
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
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE:
				return getType();
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION:
				return getRepresentation();
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT:
				return getFormat();
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT:
				return getAttachment();
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
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION:
				setRepresentation((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT:
				setFormat((CodeableConcept)newValue);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT:
				setAttachment((Attachment)newValue);
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
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION:
				setRepresentation((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT:
				setFormat((CodeableConcept)null);
				return;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT:
				setAttachment((Attachment)null);
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
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__TYPE:
				return type != null;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__REPRESENTATION:
				return representation != null;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__FORMAT:
				return format != null;
			case FHIRPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION__ATTACHMENT:
				return attachment != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerStructuralRepresentationImpl
