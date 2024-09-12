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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Medicine Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeMedicineClassificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeMedicineClassificationImpl#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeMedicineClassificationImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeMedicineClassificationImpl#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeMedicineClassificationImpl extends BackboneElementImpl implements MedicationKnowledgeMedicineClassification {
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
	 * The cached value of the '{@link #getSourceString() <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sourceString;

	/**
	 * The cached value of the '{@link #getSourceUri() <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected Uri sourceUri;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeMedicineClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationKnowledgeMedicineClassification();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSourceString() {
		return sourceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceString(org.hl7.fhir.String newSourceString, NotificationChain msgs) {
		org.hl7.fhir.String oldSourceString = sourceString;
		sourceString = newSourceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING, oldSourceString, newSourceString);
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
	public void setSourceString(org.hl7.fhir.String newSourceString) {
		if (newSourceString != sourceString) {
			NotificationChain msgs = null;
			if (sourceString != null)
				msgs = ((InternalEObject)sourceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING, null, msgs);
			if (newSourceString != null)
				msgs = ((InternalEObject)newSourceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING, null, msgs);
			msgs = basicSetSourceString(newSourceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING, newSourceString, newSourceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSourceUri() {
		return sourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceUri(Uri newSourceUri, NotificationChain msgs) {
		Uri oldSourceUri = sourceUri;
		sourceUri = newSourceUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI, oldSourceUri, newSourceUri);
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
	public void setSourceUri(Uri newSourceUri) {
		if (newSourceUri != sourceUri) {
			NotificationChain msgs = null;
			if (sourceUri != null)
				msgs = ((InternalEObject)sourceUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI, null, msgs);
			if (newSourceUri != null)
				msgs = ((InternalEObject)newSourceUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI, null, msgs);
			msgs = basicSetSourceUri(newSourceUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI, newSourceUri, newSourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING:
				return basicSetSourceString(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI:
				return basicSetSourceUri(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE:
				return getType();
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING:
				return getSourceString();
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI:
				return getSourceUri();
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION:
				return getClassification();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING:
				setSourceString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI:
				setSourceUri((Uri)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING:
				setSourceString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI:
				setSourceUri((Uri)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION:
				getClassification().clear();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__TYPE:
				return type != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_STRING:
				return sourceString != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__SOURCE_URI:
				return sourceUri != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeMedicineClassificationImpl
