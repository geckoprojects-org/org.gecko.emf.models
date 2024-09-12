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

import org.hl7.fhir.AdministrableProductDefinitionProperty;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrable Product Definition Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueMarkdown <em>Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdministrableProductDefinitionPropertyImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrableProductDefinitionPropertyImpl extends BackboneElementImpl implements AdministrableProductDefinitionProperty {
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
	 * The cached value of the '{@link #getValueCodeableConcept() <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueDate() <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date valueDate;

	/**
	 * The cached value of the '{@link #getValueBoolean() <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueBoolean;

	/**
	 * The cached value of the '{@link #getValueMarkdown() <em>Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown valueMarkdown;

	/**
	 * The cached value of the '{@link #getValueAttachment() <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueAttachment;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueReference;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrableProductDefinitionPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAdministrableProductDefinitionProperty();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValueCodeableConcept() {
		return valueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueCodeableConcept(CodeableConcept newValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueCodeableConcept = valueCodeableConcept;
		valueCodeableConcept = newValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT, oldValueCodeableConcept, newValueCodeableConcept);
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
	public void setValueCodeableConcept(CodeableConcept newValueCodeableConcept) {
		if (newValueCodeableConcept != valueCodeableConcept) {
			NotificationChain msgs = null;
			if (valueCodeableConcept != null)
				msgs = ((InternalEObject)valueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newValueCodeableConcept != null)
				msgs = ((InternalEObject)newValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueCodeableConcept(newValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT, newValueCodeableConcept, newValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValueDate() {
		return valueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueDate(Date newValueDate, NotificationChain msgs) {
		Date oldValueDate = valueDate;
		valueDate = newValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE, oldValueDate, newValueDate);
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
	public void setValueDate(Date newValueDate) {
		if (newValueDate != valueDate) {
			NotificationChain msgs = null;
			if (valueDate != null)
				msgs = ((InternalEObject)valueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE, null, msgs);
			if (newValueDate != null)
				msgs = ((InternalEObject)newValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE, null, msgs);
			msgs = basicSetValueDate(newValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE, newValueDate, newValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getValueBoolean() {
		return valueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBoolean(org.hl7.fhir.Boolean newValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueBoolean = valueBoolean;
		valueBoolean = newValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN, oldValueBoolean, newValueBoolean);
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
	public void setValueBoolean(org.hl7.fhir.Boolean newValueBoolean) {
		if (newValueBoolean != valueBoolean) {
			NotificationChain msgs = null;
			if (valueBoolean != null)
				msgs = ((InternalEObject)valueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN, null, msgs);
			if (newValueBoolean != null)
				msgs = ((InternalEObject)newValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN, null, msgs);
			msgs = basicSetValueBoolean(newValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN, newValueBoolean, newValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getValueMarkdown() {
		return valueMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMarkdown(Markdown newValueMarkdown, NotificationChain msgs) {
		Markdown oldValueMarkdown = valueMarkdown;
		valueMarkdown = newValueMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN, oldValueMarkdown, newValueMarkdown);
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
	public void setValueMarkdown(Markdown newValueMarkdown) {
		if (newValueMarkdown != valueMarkdown) {
			NotificationChain msgs = null;
			if (valueMarkdown != null)
				msgs = ((InternalEObject)valueMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN, null, msgs);
			if (newValueMarkdown != null)
				msgs = ((InternalEObject)newValueMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN, null, msgs);
			msgs = basicSetValueMarkdown(newValueMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN, newValueMarkdown, newValueMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getValueAttachment() {
		return valueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttachment(Attachment newValueAttachment, NotificationChain msgs) {
		Attachment oldValueAttachment = valueAttachment;
		valueAttachment = newValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT, oldValueAttachment, newValueAttachment);
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
	public void setValueAttachment(Attachment newValueAttachment) {
		if (newValueAttachment != valueAttachment) {
			NotificationChain msgs = null;
			if (valueAttachment != null)
				msgs = ((InternalEObject)valueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT, null, msgs);
			if (newValueAttachment != null)
				msgs = ((InternalEObject)newValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetValueAttachment(newValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT, newValueAttachment, newValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueReference(Reference newValueReference, NotificationChain msgs) {
		Reference oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE, oldValueReference, newValueReference);
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
	public void setValueReference(Reference newValueReference) {
		if (newValueReference != valueReference) {
			NotificationChain msgs = null;
			if (valueReference != null)
				msgs = ((InternalEObject)valueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE, null, msgs);
			if (newValueReference != null)
				msgs = ((InternalEObject)newValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE, null, msgs);
			msgs = basicSetValueReference(newValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE, newValueReference, newValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT:
				return basicSetValueCodeableConcept(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE:
				return basicSetValueDate(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN:
				return basicSetValueBoolean(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN:
				return basicSetValueMarkdown(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT:
				return basicSetValueAttachment(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE:
				return basicSetValueReference(null, msgs);
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS:
				return basicSetStatus(null, msgs);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE:
				return getType();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcept();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return getValueQuantity();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE:
				return getValueDate();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN:
				return getValueBoolean();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN:
				return getValueMarkdown();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT:
				return getValueAttachment();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE:
				return getValueReference();
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS:
				return getStatus();
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE:
				setValueDate((Date)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE:
				setValueReference((Reference)newValue);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS:
				setStatus((CodeableConcept)newValue);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT:
				setValueCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE:
				setValueDate((Date)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN:
				setValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN:
				setValueMarkdown((Markdown)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT:
				setValueAttachment((Attachment)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE:
				setValueReference((Reference)null);
				return;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS:
				setStatus((CodeableConcept)null);
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
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__TYPE:
				return type != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcept != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return valueQuantity != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_DATE:
				return valueDate != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_BOOLEAN:
				return valueBoolean != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_MARKDOWN:
				return valueMarkdown != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_ATTACHMENT:
				return valueAttachment != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__VALUE_REFERENCE:
				return valueReference != null;
			case FHIRPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //AdministrableProductDefinitionPropertyImpl
