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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.Citation;
import org.hl7.fhir.CitationCitedArtifact;
import org.hl7.fhir.CitationClassification;
import org.hl7.fhir.CitationStatusDate;
import org.hl7.fhir.CitationSummary;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationImpl#getCitedArtifact <em>Cited Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationImpl extends MetadataResourceImpl implements Citation {
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
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationSummary> summary;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationClassification> classification;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> currentState;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationStatusDate> statusDate;

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
	 * The cached value of the '{@link #getCitedArtifact() <em>Cited Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedArtifact()
	 * @generated
	 * @ordered
	 */
	protected CitationCitedArtifact citedArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCitation();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.CITATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CITATION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FHIRPackage.CITATION__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CITATION__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CITATION__AUTHOR);
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
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CITATION__EDITOR);
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
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CITATION__REVIEWER);
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
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CITATION__ENDORSER);
		}
		return endorser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationSummary> getSummary() {
		if (summary == null) {
			summary = new EObjectContainmentEList<CitationSummary>(CitationSummary.class, this, FHIRPackage.CITATION__SUMMARY);
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationClassification> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CitationClassification>(CitationClassification.class, this, FHIRPackage.CITATION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.CITATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCurrentState() {
		if (currentState == null) {
			currentState = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CITATION__CURRENT_STATE);
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CitationStatusDate> getStatusDate() {
		if (statusDate == null) {
			statusDate = new EObjectContainmentEList<CitationStatusDate>(CitationStatusDate.class, this, FHIRPackage.CITATION__STATUS_DATE);
		}
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FHIRPackage.CITATION__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CitationCitedArtifact getCitedArtifact() {
		return citedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitedArtifact(CitationCitedArtifact newCitedArtifact, NotificationChain msgs) {
		CitationCitedArtifact oldCitedArtifact = citedArtifact;
		citedArtifact = newCitedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__CITED_ARTIFACT, oldCitedArtifact, newCitedArtifact);
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
	public void setCitedArtifact(CitationCitedArtifact newCitedArtifact) {
		if (newCitedArtifact != citedArtifact) {
			NotificationChain msgs = null;
			if (citedArtifact != null)
				msgs = ((InternalEObject)citedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__CITED_ARTIFACT, null, msgs);
			if (newCitedArtifact != null)
				msgs = ((InternalEObject)newCitedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CITATION__CITED_ARTIFACT, null, msgs);
			msgs = basicSetCitedArtifact(newCitedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CITATION__CITED_ARTIFACT, newCitedArtifact, newCitedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CITATION__URL:
				return basicSetUrl(null, msgs);
			case FHIRPackage.CITATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__VERSION:
				return basicSetVersion(null, msgs);
			case FHIRPackage.CITATION__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FHIRPackage.CITATION__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FHIRPackage.CITATION__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.CITATION__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.CITATION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.CITATION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FHIRPackage.CITATION__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.CITATION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FHIRPackage.CITATION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.CITATION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FHIRPackage.CITATION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FHIRPackage.CITATION__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FHIRPackage.CITATION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FHIRPackage.CITATION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FHIRPackage.CITATION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FHIRPackage.CITATION__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__SUMMARY:
				return ((InternalEList<?>)getSummary()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__CURRENT_STATE:
				return ((InternalEList<?>)getCurrentState()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__STATUS_DATE:
				return ((InternalEList<?>)getStatusDate()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CITATION__CITED_ARTIFACT:
				return basicSetCitedArtifact(null, msgs);
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
			case FHIRPackage.CITATION__URL:
				return getUrl();
			case FHIRPackage.CITATION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.CITATION__VERSION:
				return getVersion();
			case FHIRPackage.CITATION__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FHIRPackage.CITATION__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FHIRPackage.CITATION__NAME:
				return getName();
			case FHIRPackage.CITATION__TITLE:
				return getTitle();
			case FHIRPackage.CITATION__STATUS:
				return getStatus();
			case FHIRPackage.CITATION__EXPERIMENTAL:
				return getExperimental();
			case FHIRPackage.CITATION__DATE:
				return getDate();
			case FHIRPackage.CITATION__PUBLISHER:
				return getPublisher();
			case FHIRPackage.CITATION__CONTACT:
				return getContact();
			case FHIRPackage.CITATION__DESCRIPTION:
				return getDescription();
			case FHIRPackage.CITATION__USE_CONTEXT:
				return getUseContext();
			case FHIRPackage.CITATION__JURISDICTION:
				return getJurisdiction();
			case FHIRPackage.CITATION__PURPOSE:
				return getPurpose();
			case FHIRPackage.CITATION__COPYRIGHT:
				return getCopyright();
			case FHIRPackage.CITATION__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FHIRPackage.CITATION__APPROVAL_DATE:
				return getApprovalDate();
			case FHIRPackage.CITATION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FHIRPackage.CITATION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FHIRPackage.CITATION__AUTHOR:
				return getAuthor();
			case FHIRPackage.CITATION__EDITOR:
				return getEditor();
			case FHIRPackage.CITATION__REVIEWER:
				return getReviewer();
			case FHIRPackage.CITATION__ENDORSER:
				return getEndorser();
			case FHIRPackage.CITATION__SUMMARY:
				return getSummary();
			case FHIRPackage.CITATION__CLASSIFICATION:
				return getClassification();
			case FHIRPackage.CITATION__NOTE:
				return getNote();
			case FHIRPackage.CITATION__CURRENT_STATE:
				return getCurrentState();
			case FHIRPackage.CITATION__STATUS_DATE:
				return getStatusDate();
			case FHIRPackage.CITATION__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FHIRPackage.CITATION__CITED_ARTIFACT:
				return getCitedArtifact();
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
			case FHIRPackage.CITATION__URL:
				setUrl((Uri)newValue);
				return;
			case FHIRPackage.CITATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.CITATION__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FHIRPackage.CITATION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FHIRPackage.CITATION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CITATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FHIRPackage.CITATION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CITATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.CITATION__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FHIRPackage.CITATION__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CITATION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FHIRPackage.CITATION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FHIRPackage.CITATION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.CITATION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FHIRPackage.CITATION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FHIRPackage.CITATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FHIRPackage.CITATION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CITATION__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CITATION__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CITATION__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CITATION__SUMMARY:
				getSummary().clear();
				getSummary().addAll((Collection<? extends CitationSummary>)newValue);
				return;
			case FHIRPackage.CITATION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CitationClassification>)newValue);
				return;
			case FHIRPackage.CITATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.CITATION__CURRENT_STATE:
				getCurrentState().clear();
				getCurrentState().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CITATION__STATUS_DATE:
				getStatusDate().clear();
				getStatusDate().addAll((Collection<? extends CitationStatusDate>)newValue);
				return;
			case FHIRPackage.CITATION__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FHIRPackage.CITATION__CITED_ARTIFACT:
				setCitedArtifact((CitationCitedArtifact)newValue);
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
			case FHIRPackage.CITATION__URL:
				setUrl((Uri)null);
				return;
			case FHIRPackage.CITATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.CITATION__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FHIRPackage.CITATION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FHIRPackage.CITATION__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CITATION__DATE:
				setDate((DateTime)null);
				return;
			case FHIRPackage.CITATION__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__CONTACT:
				getContact().clear();
				return;
			case FHIRPackage.CITATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.CITATION__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FHIRPackage.CITATION__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FHIRPackage.CITATION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FHIRPackage.CITATION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FHIRPackage.CITATION__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.CITATION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FHIRPackage.CITATION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FHIRPackage.CITATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FHIRPackage.CITATION__AUTHOR:
				getAuthor().clear();
				return;
			case FHIRPackage.CITATION__EDITOR:
				getEditor().clear();
				return;
			case FHIRPackage.CITATION__REVIEWER:
				getReviewer().clear();
				return;
			case FHIRPackage.CITATION__ENDORSER:
				getEndorser().clear();
				return;
			case FHIRPackage.CITATION__SUMMARY:
				getSummary().clear();
				return;
			case FHIRPackage.CITATION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FHIRPackage.CITATION__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.CITATION__CURRENT_STATE:
				getCurrentState().clear();
				return;
			case FHIRPackage.CITATION__STATUS_DATE:
				getStatusDate().clear();
				return;
			case FHIRPackage.CITATION__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FHIRPackage.CITATION__CITED_ARTIFACT:
				setCitedArtifact((CitationCitedArtifact)null);
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
			case FHIRPackage.CITATION__URL:
				return url != null;
			case FHIRPackage.CITATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.CITATION__VERSION:
				return version != null;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FHIRPackage.CITATION__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FHIRPackage.CITATION__NAME:
				return name != null;
			case FHIRPackage.CITATION__TITLE:
				return title != null;
			case FHIRPackage.CITATION__STATUS:
				return status != null;
			case FHIRPackage.CITATION__EXPERIMENTAL:
				return experimental != null;
			case FHIRPackage.CITATION__DATE:
				return date != null;
			case FHIRPackage.CITATION__PUBLISHER:
				return publisher != null;
			case FHIRPackage.CITATION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FHIRPackage.CITATION__DESCRIPTION:
				return description != null;
			case FHIRPackage.CITATION__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FHIRPackage.CITATION__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FHIRPackage.CITATION__PURPOSE:
				return purpose != null;
			case FHIRPackage.CITATION__COPYRIGHT:
				return copyright != null;
			case FHIRPackage.CITATION__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FHIRPackage.CITATION__APPROVAL_DATE:
				return approvalDate != null;
			case FHIRPackage.CITATION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FHIRPackage.CITATION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FHIRPackage.CITATION__AUTHOR:
				return author != null && !author.isEmpty();
			case FHIRPackage.CITATION__EDITOR:
				return editor != null && !editor.isEmpty();
			case FHIRPackage.CITATION__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FHIRPackage.CITATION__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FHIRPackage.CITATION__SUMMARY:
				return summary != null && !summary.isEmpty();
			case FHIRPackage.CITATION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FHIRPackage.CITATION__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.CITATION__CURRENT_STATE:
				return currentState != null && !currentState.isEmpty();
			case FHIRPackage.CITATION__STATUS_DATE:
				return statusDate != null && !statusDate.isEmpty();
			case FHIRPackage.CITATION__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FHIRPackage.CITATION__CITED_ARTIFACT:
				return citedArtifact != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationImpl
