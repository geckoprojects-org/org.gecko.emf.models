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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.MedicationKnowledgeDefinitional;
import org.hl7.fhir.MedicationKnowledgeIndicationGuideline;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.MedicationKnowledgeMonitoringProgram;
import org.hl7.fhir.MedicationKnowledgeMonograph;
import org.hl7.fhir.MedicationKnowledgePackaging;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeStatusCodes;
import org.hl7.fhir.MedicationKnowledgeStorageGuideline;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getIntendedJurisdiction <em>Intended Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getRelatedMedicationKnowledge <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getAssociatedMedication <em>Associated Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMonograph <em>Monograph</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMonitoringProgram <em>Monitoring Program</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getIndicationGuideline <em>Indication Guideline</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMedicineClassification <em>Medicine Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getClinicalUseIssue <em>Clinical Use Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getStorageGuideline <em>Storage Guideline</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getRegulatory <em>Regulatory</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getDefinitional <em>Definitional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeImpl extends MetadataResourceImpl implements MedicationKnowledge {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgeStatusCodes status;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getIntendedJurisdiction() <em>Intended Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> intendedJurisdiction;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> name;

	/**
	 * The cached value of the '{@link #getRelatedMedicationKnowledge() <em>Related Medication Knowledge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMedicationKnowledge()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRelatedMedicationKnowledge> relatedMedicationKnowledge;

	/**
	 * The cached value of the '{@link #getAssociatedMedication() <em>Associated Medication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> associatedMedication;

	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> productType;

	/**
	 * The cached value of the '{@link #getMonograph() <em>Monograph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonograph()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonograph> monograph;

	/**
	 * The cached value of the '{@link #getPreparationInstruction() <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparationInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown preparationInstruction;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeCost> cost;

	/**
	 * The cached value of the '{@link #getMonitoringProgram() <em>Monitoring Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonitoringProgram> monitoringProgram;

	/**
	 * The cached value of the '{@link #getIndicationGuideline() <em>Indication Guideline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeIndicationGuideline> indicationGuideline;

	/**
	 * The cached value of the '{@link #getMedicineClassification() <em>Medicine Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicineClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMedicineClassification> medicineClassification;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgePackaging> packaging;

	/**
	 * The cached value of the '{@link #getClinicalUseIssue() <em>Clinical Use Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalUseIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> clinicalUseIssue;

	/**
	 * The cached value of the '{@link #getStorageGuideline() <em>Storage Guideline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeStorageGuideline> storageGuideline;

	/**
	 * The cached value of the '{@link #getRegulatory() <em>Regulatory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatory()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRegulatory> regulatory;

	/**
	 * The cached value of the '{@link #getDefinitional() <em>Definitional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitional()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgeDefinitional definitional;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getMedicationKnowledge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationKnowledgeStatusCodes newStatus, NotificationChain msgs) {
		MedicationKnowledgeStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__STATUS, oldStatus, newStatus);
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
	public void setStatus(MedicationKnowledgeStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getIntendedJurisdiction() {
		if (intendedJurisdiction == null) {
			intendedJurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION);
		}
		return intendedJurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge() {
		if (relatedMedicationKnowledge == null) {
			relatedMedicationKnowledge = new EObjectContainmentEList<MedicationKnowledgeRelatedMedicationKnowledge>(MedicationKnowledgeRelatedMedicationKnowledge.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE);
		}
		return relatedMedicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAssociatedMedication() {
		if (associatedMedication == null) {
			associatedMedication = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION);
		}
		return associatedMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProductType() {
		if (productType == null) {
			productType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE);
		}
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMonograph> getMonograph() {
		if (monograph == null) {
			monograph = new EObjectContainmentEList<MedicationKnowledgeMonograph>(MedicationKnowledgeMonograph.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH);
		}
		return monograph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPreparationInstruction() {
		return preparationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparationInstruction(Markdown newPreparationInstruction, NotificationChain msgs) {
		Markdown oldPreparationInstruction = preparationInstruction;
		preparationInstruction = newPreparationInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, oldPreparationInstruction, newPreparationInstruction);
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
	public void setPreparationInstruction(Markdown newPreparationInstruction) {
		if (newPreparationInstruction != preparationInstruction) {
			NotificationChain msgs = null;
			if (preparationInstruction != null)
				msgs = ((InternalEObject)preparationInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			if (newPreparationInstruction != null)
				msgs = ((InternalEObject)newPreparationInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			msgs = basicSetPreparationInstruction(newPreparationInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, newPreparationInstruction, newPreparationInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeCost> getCost() {
		if (cost == null) {
			cost = new EObjectContainmentEList<MedicationKnowledgeCost>(MedicationKnowledgeCost.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMonitoringProgram> getMonitoringProgram() {
		if (monitoringProgram == null) {
			monitoringProgram = new EObjectContainmentEList<MedicationKnowledgeMonitoringProgram>(MedicationKnowledgeMonitoringProgram.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM);
		}
		return monitoringProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeIndicationGuideline> getIndicationGuideline() {
		if (indicationGuideline == null) {
			indicationGuideline = new EObjectContainmentEList<MedicationKnowledgeIndicationGuideline>(MedicationKnowledgeIndicationGuideline.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE);
		}
		return indicationGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMedicineClassification> getMedicineClassification() {
		if (medicineClassification == null) {
			medicineClassification = new EObjectContainmentEList<MedicationKnowledgeMedicineClassification>(MedicationKnowledgeMedicineClassification.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION);
		}
		return medicineClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgePackaging> getPackaging() {
		if (packaging == null) {
			packaging = new EObjectContainmentEList<MedicationKnowledgePackaging>(MedicationKnowledgePackaging.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING);
		}
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getClinicalUseIssue() {
		if (clinicalUseIssue == null) {
			clinicalUseIssue = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE);
		}
		return clinicalUseIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeStorageGuideline> getStorageGuideline() {
		if (storageGuideline == null) {
			storageGuideline = new EObjectContainmentEList<MedicationKnowledgeStorageGuideline>(MedicationKnowledgeStorageGuideline.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE);
		}
		return storageGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeRegulatory> getRegulatory() {
		if (regulatory == null) {
			regulatory = new EObjectContainmentEList<MedicationKnowledgeRegulatory>(MedicationKnowledgeRegulatory.class, this, FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY);
		}
		return regulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeDefinitional getDefinitional() {
		return definitional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitional(MedicationKnowledgeDefinitional newDefinitional, NotificationChain msgs) {
		MedicationKnowledgeDefinitional oldDefinitional = definitional;
		definitional = newDefinitional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL, oldDefinitional, newDefinitional);
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
	public void setDefinitional(MedicationKnowledgeDefinitional newDefinitional) {
		if (newDefinitional != definitional) {
			NotificationChain msgs = null;
			if (definitional != null)
				msgs = ((InternalEObject)definitional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL, null, msgs);
			if (newDefinitional != null)
				msgs = ((InternalEObject)newDefinitional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL, null, msgs);
			msgs = basicSetDefinitional(newDefinitional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL, newDefinitional, newDefinitional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION:
				return ((InternalEList<?>)getIntendedJurisdiction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return ((InternalEList<?>)getRelatedMedicationKnowledge()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return ((InternalEList<?>)getAssociatedMedication()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return ((InternalEList<?>)getProductType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return ((InternalEList<?>)getMonograph()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return basicSetPreparationInstruction(null, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__COST:
				return ((InternalEList<?>)getCost()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return ((InternalEList<?>)getMonitoringProgram()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE:
				return ((InternalEList<?>)getIndicationGuideline()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return ((InternalEList<?>)getMedicineClassification()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return ((InternalEList<?>)getPackaging()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE:
				return ((InternalEList<?>)getClinicalUseIssue()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE:
				return ((InternalEList<?>)getStorageGuideline()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return ((InternalEList<?>)getRegulatory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL:
				return basicSetDefinitional(null, msgs);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.MEDICATION_KNOWLEDGE__CODE:
				return getCode();
			case FHIRPackage.MEDICATION_KNOWLEDGE__STATUS:
				return getStatus();
			case FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR:
				return getAuthor();
			case FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION:
				return getIntendedJurisdiction();
			case FHIRPackage.MEDICATION_KNOWLEDGE__NAME:
				return getName();
			case FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return getRelatedMedicationKnowledge();
			case FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return getAssociatedMedication();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return getProductType();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return getMonograph();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return getPreparationInstruction();
			case FHIRPackage.MEDICATION_KNOWLEDGE__COST:
				return getCost();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return getMonitoringProgram();
			case FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE:
				return getIndicationGuideline();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return getMedicineClassification();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return getPackaging();
			case FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE:
				return getClinicalUseIssue();
			case FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE:
				return getStorageGuideline();
			case FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return getRegulatory();
			case FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL:
				return getDefinitional();
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
			case FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((MedicationKnowledgeStatusCodes)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION:
				getIntendedJurisdiction().clear();
				getIntendedJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledge().clear();
				getRelatedMedicationKnowledge().addAll((Collection<? extends MedicationKnowledgeRelatedMedicationKnowledge>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedication().clear();
				getAssociatedMedication().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductType().clear();
				getProductType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonograph().clear();
				getMonograph().addAll((Collection<? extends MedicationKnowledgeMonograph>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends MedicationKnowledgeCost>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringProgram().clear();
				getMonitoringProgram().addAll((Collection<? extends MedicationKnowledgeMonitoringProgram>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE:
				getIndicationGuideline().clear();
				getIndicationGuideline().addAll((Collection<? extends MedicationKnowledgeIndicationGuideline>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassification().clear();
				getMedicineClassification().addAll((Collection<? extends MedicationKnowledgeMedicineClassification>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				getPackaging().clear();
				getPackaging().addAll((Collection<? extends MedicationKnowledgePackaging>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE:
				getClinicalUseIssue().clear();
				getClinicalUseIssue().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE:
				getStorageGuideline().clear();
				getStorageGuideline().addAll((Collection<? extends MedicationKnowledgeStorageGuideline>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatory().clear();
				getRegulatory().addAll((Collection<? extends MedicationKnowledgeRegulatory>)newValue);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL:
				setDefinitional((MedicationKnowledgeDefinitional)newValue);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((MedicationKnowledgeStatusCodes)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION:
				getIntendedJurisdiction().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__NAME:
				getName().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledge().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedication().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductType().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonograph().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)null);
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__COST:
				getCost().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringProgram().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE:
				getIndicationGuideline().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassification().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				getPackaging().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE:
				getClinicalUseIssue().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE:
				getStorageGuideline().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatory().clear();
				return;
			case FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL:
				setDefinitional((MedicationKnowledgeDefinitional)null);
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
			case FHIRPackage.MEDICATION_KNOWLEDGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__CODE:
				return code != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE__STATUS:
				return status != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE__AUTHOR:
				return author != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE__INTENDED_JURISDICTION:
				return intendedJurisdiction != null && !intendedJurisdiction.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__NAME:
				return name != null && !name.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return relatedMedicationKnowledge != null && !relatedMedicationKnowledge.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return associatedMedication != null && !associatedMedication.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return productType != null && !productType.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return monograph != null && !monograph.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return preparationInstruction != null;
			case FHIRPackage.MEDICATION_KNOWLEDGE__COST:
				return cost != null && !cost.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return monitoringProgram != null && !monitoringProgram.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__INDICATION_GUIDELINE:
				return indicationGuideline != null && !indicationGuideline.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return medicineClassification != null && !medicineClassification.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return packaging != null && !packaging.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__CLINICAL_USE_ISSUE:
				return clinicalUseIssue != null && !clinicalUseIssue.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__STORAGE_GUIDELINE:
				return storageGuideline != null && !storageGuideline.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return regulatory != null && !regulatory.isEmpty();
			case FHIRPackage.MEDICATION_KNOWLEDGE__DEFINITIONAL:
				return definitional != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeImpl
