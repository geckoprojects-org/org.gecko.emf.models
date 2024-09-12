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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SearchProcessingModeType;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.VersionIndependentResourceTypesAll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getVersionAlgorithmString <em>Version Algorithm String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getVersionAlgorithmCoding <em>Version Algorithm Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getCopyrightLabel <em>Copyright Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getMultipleOr <em>Multiple Or</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getMultipleAnd <em>Multiple And</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SearchParameterImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchParameterImpl extends CanonicalResourceImpl implements SearchParameter {
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
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected Canonical derivedFrom;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionIndependentResourceTypesAll> base;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SearchParamType type;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String expression;

	/**
	 * The cached value of the '{@link #getProcessingMode() <em>Processing Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingMode()
	 * @generated
	 * @ordered
	 */
	protected SearchProcessingModeType processingMode;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String constraint;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionIndependentResourceTypesAll> target;

	/**
	 * The cached value of the '{@link #getMultipleOr() <em>Multiple Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOr()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleOr;

	/**
	 * The cached value of the '{@link #getMultipleAnd() <em>Multiple And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleAnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleAnd;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchComparator> comparator;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchModifierCode> modifier;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> chain;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchParameterComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getSearchParameter();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.SEARCH_PARAMETER__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING, oldVersionAlgorithmString, newVersionAlgorithmString);
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
				msgs = ((InternalEObject)versionAlgorithmString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING, null, msgs);
			if (newVersionAlgorithmString != null)
				msgs = ((InternalEObject)newVersionAlgorithmString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING, null, msgs);
			msgs = basicSetVersionAlgorithmString(newVersionAlgorithmString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING, newVersionAlgorithmString, newVersionAlgorithmString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING, oldVersionAlgorithmCoding, newVersionAlgorithmCoding);
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
				msgs = ((InternalEObject)versionAlgorithmCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING, null, msgs);
			if (newVersionAlgorithmCoding != null)
				msgs = ((InternalEObject)newVersionAlgorithmCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING, null, msgs);
			msgs = basicSetVersionAlgorithmCoding(newVersionAlgorithmCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING, newVersionAlgorithmCoding, newVersionAlgorithmCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(Canonical newDerivedFrom, NotificationChain msgs) {
		Canonical oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
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
	public void setDerivedFrom(Canonical newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.SEARCH_PARAMETER__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SEARCH_PARAMETER__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL, oldCopyrightLabel, newCopyrightLabel);
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
				msgs = ((InternalEObject)copyrightLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL, null, msgs);
			if (newCopyrightLabel != null)
				msgs = ((InternalEObject)newCopyrightLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL, null, msgs);
			msgs = basicSetCopyrightLabel(newCopyrightLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL, newCopyrightLabel, newCopyrightLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersionIndependentResourceTypesAll> getBase() {
		if (base == null) {
			base = new EObjectContainmentEList<VersionIndependentResourceTypesAll>(VersionIndependentResourceTypesAll.class, this, FHIRPackage.SEARCH_PARAMETER__BASE);
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SearchParamType newType, NotificationChain msgs) {
		SearchParamType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__TYPE, oldType, newType);
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
	public void setType(SearchParamType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(org.hl7.fhir.String newExpression, NotificationChain msgs) {
		org.hl7.fhir.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(org.hl7.fhir.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchProcessingModeType getProcessingMode() {
		return processingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingMode(SearchProcessingModeType newProcessingMode, NotificationChain msgs) {
		SearchProcessingModeType oldProcessingMode = processingMode;
		processingMode = newProcessingMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE, oldProcessingMode, newProcessingMode);
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
	public void setProcessingMode(SearchProcessingModeType newProcessingMode) {
		if (newProcessingMode != processingMode) {
			NotificationChain msgs = null;
			if (processingMode != null)
				msgs = ((InternalEObject)processingMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE, null, msgs);
			if (newProcessingMode != null)
				msgs = ((InternalEObject)newProcessingMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE, null, msgs);
			msgs = basicSetProcessingMode(newProcessingMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE, newProcessingMode, newProcessingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(org.hl7.fhir.String newConstraint, NotificationChain msgs) {
		org.hl7.fhir.String oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__CONSTRAINT, oldConstraint, newConstraint);
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
	public void setConstraint(org.hl7.fhir.String newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersionIndependentResourceTypesAll> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<VersionIndependentResourceTypesAll>(VersionIndependentResourceTypesAll.class, this, FHIRPackage.SEARCH_PARAMETER__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMultipleOr() {
		return multipleOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleOr(org.hl7.fhir.Boolean newMultipleOr, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleOr = multipleOr;
		multipleOr = newMultipleOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR, oldMultipleOr, newMultipleOr);
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
	public void setMultipleOr(org.hl7.fhir.Boolean newMultipleOr) {
		if (newMultipleOr != multipleOr) {
			NotificationChain msgs = null;
			if (multipleOr != null)
				msgs = ((InternalEObject)multipleOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			if (newMultipleOr != null)
				msgs = ((InternalEObject)newMultipleOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			msgs = basicSetMultipleOr(newMultipleOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR, newMultipleOr, newMultipleOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMultipleAnd() {
		return multipleAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleAnd(org.hl7.fhir.Boolean newMultipleAnd, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleAnd = multipleAnd;
		multipleAnd = newMultipleAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND, oldMultipleAnd, newMultipleAnd);
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
	public void setMultipleAnd(org.hl7.fhir.Boolean newMultipleAnd) {
		if (newMultipleAnd != multipleAnd) {
			NotificationChain msgs = null;
			if (multipleAnd != null)
				msgs = ((InternalEObject)multipleAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			if (newMultipleAnd != null)
				msgs = ((InternalEObject)newMultipleAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			msgs = basicSetMultipleAnd(newMultipleAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND, newMultipleAnd, newMultipleAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchComparator> getComparator() {
		if (comparator == null) {
			comparator = new EObjectContainmentEList<SearchComparator>(SearchComparator.class, this, FHIRPackage.SEARCH_PARAMETER__COMPARATOR);
		}
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchModifierCode> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<SearchModifierCode>(SearchModifierCode.class, this, FHIRPackage.SEARCH_PARAMETER__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getChain() {
		if (chain == null) {
			chain = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.SEARCH_PARAMETER__CHAIN);
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchParameterComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SearchParameterComponent>(SearchParameterComponent.class, this, FHIRPackage.SEARCH_PARAMETER__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SEARCH_PARAMETER__URL:
				return basicSetUrl(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__VERSION:
				return basicSetVersion(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING:
				return basicSetVersionAlgorithmString(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING:
				return basicSetVersionAlgorithmCoding(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__TITLE:
				return basicSetTitle(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__DATE:
				return basicSetDate(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL:
				return basicSetCopyrightLabel(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				return ((InternalEList<?>)getBase()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				return basicSetExpression(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE:
				return basicSetProcessingMode(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return basicSetMultipleOr(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return basicSetMultipleAnd(null, msgs);
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				return ((InternalEList<?>)getComparator()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SEARCH_PARAMETER__URL:
				return getUrl();
			case FHIRPackage.SEARCH_PARAMETER__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.SEARCH_PARAMETER__VERSION:
				return getVersion();
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING:
				return getVersionAlgorithmString();
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING:
				return getVersionAlgorithmCoding();
			case FHIRPackage.SEARCH_PARAMETER__NAME:
				return getName();
			case FHIRPackage.SEARCH_PARAMETER__TITLE:
				return getTitle();
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return getDerivedFrom();
			case FHIRPackage.SEARCH_PARAMETER__STATUS:
				return getStatus();
			case FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return getExperimental();
			case FHIRPackage.SEARCH_PARAMETER__DATE:
				return getDate();
			case FHIRPackage.SEARCH_PARAMETER__PUBLISHER:
				return getPublisher();
			case FHIRPackage.SEARCH_PARAMETER__CONTACT:
				return getContact();
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				return getDescription();
			case FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return getUseContext();
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return getJurisdiction();
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				return getPurpose();
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT:
				return getCopyright();
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL:
				return getCopyrightLabel();
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				return getCode();
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				return getBase();
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				return getType();
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				return getExpression();
			case FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE:
				return getProcessingMode();
			case FHIRPackage.SEARCH_PARAMETER__CONSTRAINT:
				return getConstraint();
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				return getTarget();
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return getMultipleOr();
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return getMultipleAnd();
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				return getComparator();
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				return getModifier();
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				return getChain();
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return getComponent();
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
			case FHIRPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Canonical)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				getBase().clear();
				getBase().addAll((Collection<? extends VersionIndependentResourceTypesAll>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				setType((SearchParamType)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE:
				setProcessingMode((SearchProcessingModeType)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CONSTRAINT:
				setConstraint((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends VersionIndependentResourceTypesAll>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparator().clear();
				getComparator().addAll((Collection<? extends SearchComparator>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends SearchModifierCode>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				getChain().clear();
				getChain().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SearchParameterComponent>)newValue);
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
			case FHIRPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING:
				setVersionAlgorithmString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING:
				setVersionAlgorithmCoding((Coding)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Canonical)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CONTACT:
				getContact().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL:
				setCopyrightLabel((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				getBase().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				setType((SearchParamType)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE:
				setProcessingMode((SearchProcessingModeType)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CONSTRAINT:
				setConstraint((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				getTarget().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparator().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				getModifier().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				getChain().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				getComponent().clear();
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
			case FHIRPackage.SEARCH_PARAMETER__URL:
				return url != null;
			case FHIRPackage.SEARCH_PARAMETER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__VERSION:
				return version != null;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_STRING:
				return versionAlgorithmString != null;
			case FHIRPackage.SEARCH_PARAMETER__VERSION_ALGORITHM_CODING:
				return versionAlgorithmCoding != null;
			case FHIRPackage.SEARCH_PARAMETER__NAME:
				return name != null;
			case FHIRPackage.SEARCH_PARAMETER__TITLE:
				return title != null;
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return derivedFrom != null;
			case FHIRPackage.SEARCH_PARAMETER__STATUS:
				return status != null;
			case FHIRPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return experimental != null;
			case FHIRPackage.SEARCH_PARAMETER__DATE:
				return date != null;
			case FHIRPackage.SEARCH_PARAMETER__PUBLISHER:
				return publisher != null;
			case FHIRPackage.SEARCH_PARAMETER__CONTACT:
				return contact != null && !contact.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				return description != null;
			case FHIRPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				return purpose != null;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT:
				return copyright != null;
			case FHIRPackage.SEARCH_PARAMETER__COPYRIGHT_LABEL:
				return copyrightLabel != null;
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				return code != null;
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				return base != null && !base.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				return type != null;
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				return expression != null;
			case FHIRPackage.SEARCH_PARAMETER__PROCESSING_MODE:
				return processingMode != null;
			case FHIRPackage.SEARCH_PARAMETER__CONSTRAINT:
				return constraint != null;
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				return target != null && !target.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return multipleOr != null;
			case FHIRPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return multipleAnd != null;
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				return comparator != null && !comparator.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				return chain != null && !chain.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchParameterImpl
