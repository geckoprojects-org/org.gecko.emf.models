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

import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.Age;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestResourceTypes;
import org.hl7.fhir.Timing;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getSubjectCanonical <em>Subject Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTimingAge <em>Timing Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getProductReference <em>Product Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getProductCodeableConcept <em>Product Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getSpecimenRequirement <em>Specimen Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getObservationRequirement <em>Observation Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getObservationResultRequirement <em>Observation Result Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ActivityDefinitionImpl#getDynamicValue <em>Dynamic Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDefinitionImpl extends MetadataResourceImpl implements ActivityDefinition {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getVersionAlgorithmString() <em>Version Algorithm String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAlgorithmString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String versionAlgorithmString;

	/**
	 * The cached value of the '{@link #getVersionAlgorithmCoding() <em>Version Algorithm Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAlgorithmCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding versionAlgorithmCoding;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subtitle;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getSubjectCodeableConcept() <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubjectReference() <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReference()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectReference;

	/**
	 * The cached value of the '{@link #getSubjectCanonical() <em>Subject Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical subjectCanonical;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contact;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Markdown usage;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getCopyrightLabel() <em>Copyright Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyrightLabel;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topic;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> author;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> editor;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> reviewer;

	/**
	 * The cached value of the '{@link #getEndorser() <em>Endorser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorser()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> endorser;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> library;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected RequestResourceTypes kind;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Canonical profile;

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
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected RequestIntent intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean doNotPerform;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getTimingAge() <em>Timing Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingAge()
	 * @generated
	 * @ordered
	 */
	protected Age timingAge;

	/**
	 * The cached value of the '{@link #getTimingRange() <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingRange()
	 * @generated
	 * @ordered
	 */
	protected Range timingRange;

	/**
	 * The cached value of the '{@link #getTimingDuration() <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration timingDuration;

	/**
	 * The cached value of the '{@link #getAsNeededBoolean() <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean asNeededBoolean;

	/**
	 * The cached value of the '{@link #getAsNeededCodeableConcept() <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept asNeededCodeableConcept;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference location;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinitionParticipant> participant;

	/**
	 * The cached value of the '{@link #getProductReference() <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReference()
	 * @generated
	 * @ordered
	 */
	protected Reference productReference;

	/**
	 * The cached value of the '{@link #getProductCodeableConcept() <em>Product Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCodeableConcept;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosage;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySite;

	/**
	 * The cached value of the '{@link #getSpecimenRequirement() <em>Specimen Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> specimenRequirement;

	/**
	 * The cached value of the '{@link #getObservationRequirement() <em>Observation Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> observationRequirement;

	/**
	 * The cached value of the '{@link #getObservationResultRequirement() <em>Observation Result Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationResultRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> observationResultRequirement;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Canonical transform;

	/**
	 * The cached value of the '{@link #getDynamicValue() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinitionDynamicValue> dynamicValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getActivityDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__URL, oldUrl, newUrl);
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
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersionAlgorithmString() {
		return versionAlgorithmString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAlgorithmString(org.hl7.fhir.String newVersionAlgorithmString, NotificationChain msgs) {
		org.hl7.fhir.String oldVersionAlgorithmString = versionAlgorithmString;
		versionAlgorithmString = newVersionAlgorithmString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
	public void setVersionAlgorithmString(org.hl7.fhir.String newVersionAlgorithmString) {
		if (newVersionAlgorithmString != versionAlgorithmString) {
			NotificationChain msgs = null;
			if (versionAlgorithmString != null)
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getVersionAlgorithmCoding() {
		return versionAlgorithmCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAlgorithmCoding(Coding newVersionAlgorithmCoding, NotificationChain msgs) {
		Coding oldVersionAlgorithmCoding = versionAlgorithmCoding;
		versionAlgorithmCoding = newVersionAlgorithmCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
	public void setVersionAlgorithmCoding(Coding newVersionAlgorithmCoding) {
		if (newVersionAlgorithmCoding != versionAlgorithmCoding) {
			NotificationChain msgs = null;
			if (versionAlgorithmCoding != null)
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(org.hl7.fhir.String newSubtitle, NotificationChain msgs) {
		org.hl7.fhir.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(org.hl7.fhir.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubjectCodeableConcept() {
		return subjectCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubjectCodeableConcept = subjectCodeableConcept;
		subjectCodeableConcept = newSubjectCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT, oldSubjectCodeableConcept, newSubjectCodeableConcept);
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
	public void setSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept) {
		if (newSubjectCodeableConcept != subjectCodeableConcept) {
			NotificationChain msgs = null;
			if (subjectCodeableConcept != null)
				msgs = ((InternalEObject)subjectCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			if (newSubjectCodeableConcept != null)
				msgs = ((InternalEObject)newSubjectCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubjectCodeableConcept(newSubjectCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT, newSubjectCodeableConcept, newSubjectCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubjectReference() {
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectReference(Reference newSubjectReference, NotificationChain msgs) {
		Reference oldSubjectReference = subjectReference;
		subjectReference = newSubjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE, oldSubjectReference, newSubjectReference);
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
	public void setSubjectReference(Reference newSubjectReference) {
		if (newSubjectReference != subjectReference) {
			NotificationChain msgs = null;
			if (subjectReference != null)
				msgs = ((InternalEObject)subjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE, null, msgs);
			if (newSubjectReference != null)
				msgs = ((InternalEObject)newSubjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE, null, msgs);
			msgs = basicSetSubjectReference(newSubjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE, newSubjectReference, newSubjectReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getSubjectCanonical() {
		return subjectCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCanonical(Canonical newSubjectCanonical, NotificationChain msgs) {
		Canonical oldSubjectCanonical = subjectCanonical;
		subjectCanonical = newSubjectCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL, oldSubjectCanonical, newSubjectCanonical);
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
	public void setSubjectCanonical(Canonical newSubjectCanonical) {
		if (newSubjectCanonical != subjectCanonical) {
			NotificationChain msgs = null;
			if (subjectCanonical != null)
				msgs = ((InternalEObject)subjectCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL, null, msgs);
			if (newSubjectCanonical != null)
				msgs = ((InternalEObject)newSubjectCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL, null, msgs);
			msgs = basicSetSubjectCanonical(newSubjectCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL, newSubjectCanonical, newSubjectCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.ACTIVITY_DEFINITION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Markdown newPurpose, NotificationChain msgs) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(Markdown newUsage, NotificationChain msgs) {
		Markdown oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__USAGE, oldUsage, newUsage);
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
	public void setUsage(Markdown newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(Markdown newCopyright, NotificationChain msgs) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCopyrightLabel() {
		return copyrightLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyrightLabel(org.hl7.fhir.String newCopyrightLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyrightLabel = copyrightLabel;
		copyrightLabel = newCopyrightLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
	public void setCopyrightLabel(org.hl7.fhir.String newCopyrightLabel) {
		if (newCopyrightLabel != copyrightLabel) {
			NotificationChain msgs = null;
			if (copyrightLabel != null)
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ACTIVITY_DEFINITION__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.ACTIVITY_DEFINITION__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEditor() {
		if (editor == null) {
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.ACTIVITY_DEFINITION__EDITOR);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getReviewer() {
		if (reviewer == null) {
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.ACTIVITY_DEFINITION__REVIEWER);
		}
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEndorser() {
		if (endorser == null) {
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.ACTIVITY_DEFINITION__ENDORSER);
		}
		return endorser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.ACTIVITY_DEFINITION__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResourceTypes getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(RequestResourceTypes newKind, NotificationChain msgs) {
		RequestResourceTypes oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__KIND, oldKind, newKind);
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
	public void setKind(RequestResourceTypes newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Canonical newProfile, NotificationChain msgs) {
		Canonical oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PROFILE, oldProfile, newProfile);
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
	public void setProfile(Canonical newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PROFILE, newProfile, newProfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestIntent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(RequestIntent newIntent, NotificationChain msgs) {
		RequestIntent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__INTENT, oldIntent, newIntent);
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
	public void setIntent(RequestIntent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(org.hl7.fhir.Boolean newDoNotPerform, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
	public void setDoNotPerform(org.hl7.fhir.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING, oldTimingTiming, newTimingTiming);
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
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getTimingAge() {
		return timingAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingAge(Age newTimingAge, NotificationChain msgs) {
		Age oldTimingAge = timingAge;
		timingAge = newTimingAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE, oldTimingAge, newTimingAge);
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
	public void setTimingAge(Age newTimingAge) {
		if (newTimingAge != timingAge) {
			NotificationChain msgs = null;
			if (timingAge != null)
				msgs = ((InternalEObject)timingAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE, null, msgs);
			if (newTimingAge != null)
				msgs = ((InternalEObject)newTimingAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE, null, msgs);
			msgs = basicSetTimingAge(newTimingAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE, newTimingAge, newTimingAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getTimingRange() {
		return timingRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingRange(Range newTimingRange, NotificationChain msgs) {
		Range oldTimingRange = timingRange;
		timingRange = newTimingRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE, oldTimingRange, newTimingRange);
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
	public void setTimingRange(Range newTimingRange) {
		if (newTimingRange != timingRange) {
			NotificationChain msgs = null;
			if (timingRange != null)
				msgs = ((InternalEObject)timingRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE, null, msgs);
			if (newTimingRange != null)
				msgs = ((InternalEObject)newTimingRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE, null, msgs);
			msgs = basicSetTimingRange(newTimingRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE, newTimingRange, newTimingRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getTimingDuration() {
		return timingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDuration(Duration newTimingDuration, NotificationChain msgs) {
		Duration oldTimingDuration = timingDuration;
		timingDuration = newTimingDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION, oldTimingDuration, newTimingDuration);
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
	public void setTimingDuration(Duration newTimingDuration) {
		if (newTimingDuration != timingDuration) {
			NotificationChain msgs = null;
			if (timingDuration != null)
				msgs = ((InternalEObject)timingDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION, null, msgs);
			if (newTimingDuration != null)
				msgs = ((InternalEObject)newTimingDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION, null, msgs);
			msgs = basicSetTimingDuration(newTimingDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION, newTimingDuration, newTimingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAsNeededBoolean() {
		return asNeededBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAsNeededBoolean = asNeededBoolean;
		asNeededBoolean = newAsNeededBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN, oldAsNeededBoolean, newAsNeededBoolean);
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
	public void setAsNeededBoolean(org.hl7.fhir.Boolean newAsNeededBoolean) {
		if (newAsNeededBoolean != asNeededBoolean) {
			NotificationChain msgs = null;
			if (asNeededBoolean != null)
				msgs = ((InternalEObject)asNeededBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN, null, msgs);
			if (newAsNeededBoolean != null)
				msgs = ((InternalEObject)newAsNeededBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN, null, msgs);
			msgs = basicSetAsNeededBoolean(newAsNeededBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN, newAsNeededBoolean, newAsNeededBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAsNeededCodeableConcept() {
		return asNeededCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAsNeededCodeableConcept = asNeededCodeableConcept;
		asNeededCodeableConcept = newAsNeededCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT, oldAsNeededCodeableConcept, newAsNeededCodeableConcept);
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
	public void setAsNeededCodeableConcept(CodeableConcept newAsNeededCodeableConcept) {
		if (newAsNeededCodeableConcept != asNeededCodeableConcept) {
			NotificationChain msgs = null;
			if (asNeededCodeableConcept != null)
				msgs = ((InternalEObject)asNeededCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			if (newAsNeededCodeableConcept != null)
				msgs = ((InternalEObject)newAsNeededCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAsNeededCodeableConcept(newAsNeededCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT, newAsNeededCodeableConcept, newAsNeededCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(CodeableReference newLocation, NotificationChain msgs) {
		CodeableReference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__LOCATION, oldLocation, newLocation);
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
	public void setLocation(CodeableReference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityDefinitionParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<ActivityDefinitionParticipant>(ActivityDefinitionParticipant.class, this, FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProductReference() {
		return productReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductReference(Reference newProductReference, NotificationChain msgs) {
		Reference oldProductReference = productReference;
		productReference = newProductReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE, oldProductReference, newProductReference);
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
	public void setProductReference(Reference newProductReference) {
		if (newProductReference != productReference) {
			NotificationChain msgs = null;
			if (productReference != null)
				msgs = ((InternalEObject)productReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE, null, msgs);
			if (newProductReference != null)
				msgs = ((InternalEObject)newProductReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE, null, msgs);
			msgs = basicSetProductReference(newProductReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE, newProductReference, newProductReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductCodeableConcept() {
		return productCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCodeableConcept(CodeableConcept newProductCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldProductCodeableConcept = productCodeableConcept;
		productCodeableConcept = newProductCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT, oldProductCodeableConcept, newProductCodeableConcept);
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
	public void setProductCodeableConcept(CodeableConcept newProductCodeableConcept) {
		if (newProductCodeableConcept != productCodeableConcept) {
			NotificationChain msgs = null;
			if (productCodeableConcept != null)
				msgs = ((InternalEObject)productCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			if (newProductCodeableConcept != null)
				msgs = ((InternalEObject)newProductCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetProductCodeableConcept(newProductCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT, newProductCodeableConcept, newProductCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dosage> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<Dosage>(Dosage.class, this, FHIRPackage.ACTIVITY_DEFINITION__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE);
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getSpecimenRequirement() {
		if (specimenRequirement == null) {
			specimenRequirement = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT);
		}
		return specimenRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getObservationRequirement() {
		if (observationRequirement == null) {
			observationRequirement = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT);
		}
		return observationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getObservationResultRequirement() {
		if (observationResultRequirement == null) {
			observationResultRequirement = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT);
		}
		return observationResultRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Canonical newTransform, NotificationChain msgs) {
		Canonical oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM, oldTransform, newTransform);
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
	public void setTransform(Canonical newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityDefinitionDynamicValue> getDynamicValue() {
		if (dynamicValue == null) {
			dynamicValue = new EObjectContainmentEList<ActivityDefinitionDynamicValue>(ActivityDefinitionDynamicValue.class, this, FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE);
		}
		return dynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ACTIVITY_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return basicSetSubjectCodeableConcept(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE:
				return basicSetSubjectReference(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL:
				return basicSetSubjectCanonical(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__USAGE:
				return basicSetUsage(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__KIND:
				return basicSetKind(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PROFILE:
				return basicSetProfile(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__INTENT:
				return basicSetIntent(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PRIORITY:
				return basicSetPriority(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE:
				return basicSetTimingAge(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE:
				return basicSetTimingRange(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION:
				return basicSetTimingDuration(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN:
				return basicSetAsNeededBoolean(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT:
				return basicSetAsNeededCodeableConcept(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__LOCATION:
				return basicSetLocation(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE:
				return basicSetProductReference(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT:
				return basicSetProductCodeableConcept(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return ((InternalEList<?>)getSpecimenRequirement()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return ((InternalEList<?>)getObservationRequirement()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return ((InternalEList<?>)getObservationResultRequirement()).basicRemove(otherEnd, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValue()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.ACTIVITY_DEFINITION__URL:
				return getUrl();
			case FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION:
				return getVersion();
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FHIRPackage.ACTIVITY_DEFINITION__NAME:
				return getName();
			case FHIRPackage.ACTIVITY_DEFINITION__TITLE:
				return getTitle();
			case FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return getSubtitle();
			case FHIRPackage.ACTIVITY_DEFINITION__STATUS:
				return getStatus();
			case FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return getSubjectCodeableConcept();
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE:
				return getSubjectReference();
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL:
				return getSubjectCanonical();
			case FHIRPackage.ACTIVITY_DEFINITION__DATE:
				return getDate();
			case FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return getPublisher();
			case FHIRPackage.ACTIVITY_DEFINITION__CONTACT:
				return getContact();
			case FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return getDescription();
			case FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return getUseContext();
			case FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return getJurisdiction();
			case FHIRPackage.ACTIVITY_DEFINITION__PURPOSE:
				return getPurpose();
			case FHIRPackage.ACTIVITY_DEFINITION__USAGE:
				return getUsage();
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return getCopyright();
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return getApprovalDate();
			case FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FHIRPackage.ACTIVITY_DEFINITION__TOPIC:
				return getTopic();
			case FHIRPackage.ACTIVITY_DEFINITION__AUTHOR:
				return getAuthor();
			case FHIRPackage.ACTIVITY_DEFINITION__EDITOR:
				return getEditor();
			case FHIRPackage.ACTIVITY_DEFINITION__REVIEWER:
				return getReviewer();
			case FHIRPackage.ACTIVITY_DEFINITION__ENDORSER:
				return getEndorser();
			case FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FHIRPackage.ACTIVITY_DEFINITION__LIBRARY:
				return getLibrary();
			case FHIRPackage.ACTIVITY_DEFINITION__KIND:
				return getKind();
			case FHIRPackage.ACTIVITY_DEFINITION__PROFILE:
				return getProfile();
			case FHIRPackage.ACTIVITY_DEFINITION__CODE:
				return getCode();
			case FHIRPackage.ACTIVITY_DEFINITION__INTENT:
				return getIntent();
			case FHIRPackage.ACTIVITY_DEFINITION__PRIORITY:
				return getPriority();
			case FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return getDoNotPerform();
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING:
				return getTimingTiming();
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE:
				return getTimingAge();
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE:
				return getTimingRange();
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION:
				return getTimingDuration();
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN:
				return getAsNeededBoolean();
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT:
				return getAsNeededCodeableConcept();
			case FHIRPackage.ACTIVITY_DEFINITION__LOCATION:
				return getLocation();
			case FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return getParticipant();
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE:
				return getProductReference();
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT:
				return getProductCodeableConcept();
			case FHIRPackage.ACTIVITY_DEFINITION__QUANTITY:
				return getQuantity();
			case FHIRPackage.ACTIVITY_DEFINITION__DOSAGE:
				return getDosage();
			case FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return getBodySite();
			case FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return getSpecimenRequirement();
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return getObservationRequirement();
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return getObservationResultRequirement();
			case FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return getTransform();
			case FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return getDynamicValue();
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
			case FHIRPackage.ACTIVITY_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE:
				setSubjectReference((Reference)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL:
				setSubjectCanonical((Canonical)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__USAGE:
				setUsage((Markdown)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__KIND:
				setKind((RequestResourceTypes)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PROFILE:
				setProfile((Canonical)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__INTENT:
				setIntent((RequestIntent)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE:
				setTimingAge((Age)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE:
				setTimingRange((Range)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION:
				setTimingDuration((Duration)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LOCATION:
				setLocation((CodeableReference)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends ActivityDefinitionParticipant>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE:
				setProductReference((Reference)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends Dosage>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				getSpecimenRequirement().clear();
				getSpecimenRequirement().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				getObservationRequirement().clear();
				getObservationRequirement().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				getObservationResultRequirement().clear();
				getObservationResultRequirement().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM:
				setTransform((Canonical)newValue);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				getDynamicValue().clear();
				getDynamicValue().addAll((Collection<? extends ActivityDefinitionDynamicValue>)newValue);
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
			case FHIRPackage.ACTIVITY_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE:
				setSubjectReference((Reference)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL:
				setSubjectCanonical((Canonical)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__USAGE:
				setUsage((Markdown)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TOPIC:
				getTopic().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AUTHOR:
				getAuthor().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__EDITOR:
				getEditor().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__REVIEWER:
				getReviewer().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__ENDORSER:
				getEndorser().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LIBRARY:
				getLibrary().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__KIND:
				setKind((RequestResourceTypes)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PROFILE:
				setProfile((Canonical)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__INTENT:
				setIntent((RequestIntent)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE:
				setTimingAge((Age)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE:
				setTimingRange((Range)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION:
				setTimingDuration((Duration)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN:
				setAsNeededBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT:
				setAsNeededCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__LOCATION:
				setLocation((CodeableReference)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				getParticipant().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE:
				setProductReference((Reference)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DOSAGE:
				getDosage().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE:
				getBodySite().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				getSpecimenRequirement().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				getObservationRequirement().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				getObservationResultRequirement().clear();
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM:
				setTransform((Canonical)null);
				return;
			case FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				getDynamicValue().clear();
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
			case FHIRPackage.ACTIVITY_DEFINITION__URL:
				return url != null;
			case FHIRPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION:
				return version != null;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FHIRPackage.ACTIVITY_DEFINITION__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FHIRPackage.ACTIVITY_DEFINITION__NAME:
				return name != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TITLE:
				return title != null;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return subtitle != null;
			case FHIRPackage.ACTIVITY_DEFINITION__STATUS:
				return status != null;
			case FHIRPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CODEABLE_CONCEPT:
				return subjectCodeableConcept != null;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_REFERENCE:
				return subjectReference != null;
			case FHIRPackage.ACTIVITY_DEFINITION__SUBJECT_CANONICAL:
				return subjectCanonical != null;
			case FHIRPackage.ACTIVITY_DEFINITION__DATE:
				return date != null;
			case FHIRPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return publisher != null;
			case FHIRPackage.ACTIVITY_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return description != null;
			case FHIRPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__PURPOSE:
				return purpose != null;
			case FHIRPackage.ACTIVITY_DEFINITION__USAGE:
				return usage != null;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return copyright != null;
			case FHIRPackage.ACTIVITY_DEFINITION__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FHIRPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return approvalDate != null;
			case FHIRPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FHIRPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TOPIC:
				return topic != null && !topic.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__AUTHOR:
				return author != null && !author.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__EDITOR:
				return editor != null && !editor.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__LIBRARY:
				return library != null && !library.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__KIND:
				return kind != null;
			case FHIRPackage.ACTIVITY_DEFINITION__PROFILE:
				return profile != null;
			case FHIRPackage.ACTIVITY_DEFINITION__CODE:
				return code != null;
			case FHIRPackage.ACTIVITY_DEFINITION__INTENT:
				return intent != null;
			case FHIRPackage.ACTIVITY_DEFINITION__PRIORITY:
				return priority != null;
			case FHIRPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return doNotPerform != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_TIMING:
				return timingTiming != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_AGE:
				return timingAge != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_RANGE:
				return timingRange != null;
			case FHIRPackage.ACTIVITY_DEFINITION__TIMING_DURATION:
				return timingDuration != null;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_BOOLEAN:
				return asNeededBoolean != null;
			case FHIRPackage.ACTIVITY_DEFINITION__AS_NEEDED_CODEABLE_CONCEPT:
				return asNeededCodeableConcept != null;
			case FHIRPackage.ACTIVITY_DEFINITION__LOCATION:
				return location != null;
			case FHIRPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_REFERENCE:
				return productReference != null;
			case FHIRPackage.ACTIVITY_DEFINITION__PRODUCT_CODEABLE_CONCEPT:
				return productCodeableConcept != null;
			case FHIRPackage.ACTIVITY_DEFINITION__QUANTITY:
				return quantity != null;
			case FHIRPackage.ACTIVITY_DEFINITION__DOSAGE:
				return dosage != null && !dosage.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return specimenRequirement != null && !specimenRequirement.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return observationRequirement != null && !observationRequirement.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return observationResultRequirement != null && !observationResultRequirement.isEmpty();
			case FHIRPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return transform != null;
			case FHIRPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return dynamicValue != null && !dynamicValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDefinitionImpl
