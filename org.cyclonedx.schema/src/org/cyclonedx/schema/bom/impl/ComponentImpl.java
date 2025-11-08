/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.AuthorsType1;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.Classification;
import org.cyclonedx.schema.bom.Component;
import org.cyclonedx.schema.bom.ComponentDataType;
import org.cyclonedx.schema.bom.ComponentEvidenceType;
import org.cyclonedx.schema.bom.ComponentsType;
import org.cyclonedx.schema.bom.CryptoPropertiesType;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.HashesType;
import org.cyclonedx.schema.bom.LicenseChoiceType;
import org.cyclonedx.schema.bom.ModelCardType;
import org.cyclonedx.schema.bom.OrganizationalEntity;
import org.cyclonedx.schema.bom.PedigreeType;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ReleaseNotesType;
import org.cyclonedx.schema.bom.Scope;
import org.cyclonedx.schema.bom.SwidType;
import org.cyclonedx.schema.bom.TagsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getHashes <em>Hashes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getCpe <em>Cpe</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getPurl <em>Purl</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getOmniborId <em>Omnibor Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getSwhid <em>Swhid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getSwid <em>Swid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#isModified <em>Modified</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getPedigree <em>Pedigree</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getModelCard <em>Model Card</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getCryptoProperties <em>Crypto Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity supplier;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity manufacturer;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected AuthorsType1 authors;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.REQUIRED;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

	/**
	 * The cached value of the '{@link #getHashes() <em>Hashes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashes()
	 * @generated
	 * @ordered
	 */
	protected HashesType hashes;

	/**
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected LicenseChoiceType licenses;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpe() <em>Cpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpe()
	 * @generated
	 * @ordered
	 */
	protected static final String CPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpe() <em>Cpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpe()
	 * @generated
	 * @ordered
	 */
	protected String cpe = CPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurl() <em>Purl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurl()
	 * @generated
	 * @ordered
	 */
	protected static final String PURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurl() <em>Purl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurl()
	 * @generated
	 * @ordered
	 */
	protected String purl = PURL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOmniborId() <em>Omnibor Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmniborId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> omniborId;

	/**
	 * The cached value of the '{@link #getSwhid() <em>Swhid</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwhid()
	 * @generated
	 * @ordered
	 */
	protected EList<String> swhid;

	/**
	 * The cached value of the '{@link #getSwid() <em>Swid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwid()
	 * @generated
	 * @ordered
	 */
	protected SwidType swid;

	/**
	 * The default value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected boolean modified = MODIFIED_EDEFAULT;

	/**
	 * This is true if the Modified attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifiedESet;

	/**
	 * The cached value of the '{@link #getPedigree() <em>Pedigree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedigree()
	 * @generated
	 * @ordered
	 */
	protected PedigreeType pedigree;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType components;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected ComponentEvidenceType evidence;

	/**
	 * The cached value of the '{@link #getReleaseNotes() <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseNotes()
	 * @generated
	 * @ordered
	 */
	protected ReleaseNotesType releaseNotes;

	/**
	 * The cached value of the '{@link #getModelCard() <em>Model Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCard()
	 * @generated
	 * @ordered
	 */
	protected ModelCardType modelCard;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentDataType> data;

	/**
	 * The cached value of the '{@link #getCryptoProperties() <em>Crypto Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoProperties()
	 * @generated
	 * @ordered
	 */
	protected CryptoPropertiesType cryptoProperties;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected TagsType tags;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Classification TYPE_EDEFAULT = Classification.APPLICATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Classification type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(OrganizationalEntity newSupplier, NotificationChain msgs) {
		OrganizationalEntity oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__SUPPLIER, oldSupplier, newSupplier);
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
	public void setSupplier(OrganizationalEntity newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__SUPPLIER, null, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__SUPPLIER, null, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(OrganizationalEntity newManufacturer, NotificationChain msgs) {
		OrganizationalEntity oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(OrganizationalEntity newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorsType1 getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(AuthorsType1 newAuthors, NotificationChain msgs) {
		AuthorsType1 oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__AUTHORS, oldAuthors, newAuthors);
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
	public void setAuthors(AuthorsType1 newAuthors) {
		if (newAuthors != authors) {
			NotificationChain msgs = null;
			if (authors != null)
				msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__AUTHORS, null, msgs);
			if (newAuthors != null)
				msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__AUTHORS, null, msgs);
			msgs = basicSetAuthors(newAuthors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__AUTHORS, newAuthors, newAuthors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScope() {
		Scope oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.COMPONENT__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScope() {
		return scopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashesType getHashes() {
		return hashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHashes(HashesType newHashes, NotificationChain msgs) {
		HashesType oldHashes = hashes;
		hashes = newHashes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__HASHES, oldHashes, newHashes);
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
	public void setHashes(HashesType newHashes) {
		if (newHashes != hashes) {
			NotificationChain msgs = null;
			if (hashes != null)
				msgs = ((InternalEObject)hashes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__HASHES, null, msgs);
			if (newHashes != null)
				msgs = ((InternalEObject)newHashes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__HASHES, null, msgs);
			msgs = basicSetHashes(newHashes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__HASHES, newHashes, newHashes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseChoiceType getLicenses() {
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenses(LicenseChoiceType newLicenses, NotificationChain msgs) {
		LicenseChoiceType oldLicenses = licenses;
		licenses = newLicenses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__LICENSES, oldLicenses, newLicenses);
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
	public void setLicenses(LicenseChoiceType newLicenses) {
		if (newLicenses != licenses) {
			NotificationChain msgs = null;
			if (licenses != null)
				msgs = ((InternalEObject)licenses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__LICENSES, null, msgs);
			if (newLicenses != null)
				msgs = ((InternalEObject)newLicenses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__LICENSES, null, msgs);
			msgs = basicSetLicenses(newLicenses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__LICENSES, newLicenses, newLicenses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpe() {
		return cpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpe(String newCpe) {
		String oldCpe = cpe;
		cpe = newCpe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__CPE, oldCpe, cpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurl() {
		return purl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurl(String newPurl) {
		String oldPurl = purl;
		purl = newPurl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PURL, oldPurl, purl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOmniborId() {
		if (omniborId == null) {
			omniborId = new EDataTypeEList<String>(String.class, this, BOMPackage.COMPONENT__OMNIBOR_ID);
		}
		return omniborId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSwhid() {
		if (swhid == null) {
			swhid = new EDataTypeEList<String>(String.class, this, BOMPackage.COMPONENT__SWHID);
		}
		return swhid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwidType getSwid() {
		return swid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwid(SwidType newSwid, NotificationChain msgs) {
		SwidType oldSwid = swid;
		swid = newSwid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__SWID, oldSwid, newSwid);
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
	public void setSwid(SwidType newSwid) {
		if (newSwid != swid) {
			NotificationChain msgs = null;
			if (swid != null)
				msgs = ((InternalEObject)swid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__SWID, null, msgs);
			if (newSwid != null)
				msgs = ((InternalEObject)newSwid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__SWID, null, msgs);
			msgs = basicSetSwid(newSwid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__SWID, newSwid, newSwid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(boolean newModified) {
		boolean oldModified = modified;
		modified = newModified;
		boolean oldModifiedESet = modifiedESet;
		modifiedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MODIFIED, oldModified, modified, !oldModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetModified() {
		boolean oldModified = modified;
		boolean oldModifiedESet = modifiedESet;
		modified = MODIFIED_EDEFAULT;
		modifiedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.COMPONENT__MODIFIED, oldModified, MODIFIED_EDEFAULT, oldModifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetModified() {
		return modifiedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PedigreeType getPedigree() {
		return pedigree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPedigree(PedigreeType newPedigree, NotificationChain msgs) {
		PedigreeType oldPedigree = pedigree;
		pedigree = newPedigree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PEDIGREE, oldPedigree, newPedigree);
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
	public void setPedigree(PedigreeType newPedigree) {
		if (newPedigree != pedigree) {
			NotificationChain msgs = null;
			if (pedigree != null)
				msgs = ((InternalEObject)pedigree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__PEDIGREE, null, msgs);
			if (newPedigree != null)
				msgs = ((InternalEObject)newPedigree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__PEDIGREE, null, msgs);
			msgs = basicSetPedigree(newPedigree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PEDIGREE, newPedigree, newPedigree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentsType newComponents, NotificationChain msgs) {
		ComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(ComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentEvidenceType getEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(ComponentEvidenceType newEvidence, NotificationChain msgs) {
		ComponentEvidenceType oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__EVIDENCE, oldEvidence, newEvidence);
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
	public void setEvidence(ComponentEvidenceType newEvidence) {
		if (newEvidence != evidence) {
			NotificationChain msgs = null;
			if (evidence != null)
				msgs = ((InternalEObject)evidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__EVIDENCE, null, msgs);
			if (newEvidence != null)
				msgs = ((InternalEObject)newEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__EVIDENCE, null, msgs);
			msgs = basicSetEvidence(newEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__EVIDENCE, newEvidence, newEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseNotesType getReleaseNotes() {
		return releaseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseNotes(ReleaseNotesType newReleaseNotes, NotificationChain msgs) {
		ReleaseNotesType oldReleaseNotes = releaseNotes;
		releaseNotes = newReleaseNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__RELEASE_NOTES, oldReleaseNotes, newReleaseNotes);
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
	public void setReleaseNotes(ReleaseNotesType newReleaseNotes) {
		if (newReleaseNotes != releaseNotes) {
			NotificationChain msgs = null;
			if (releaseNotes != null)
				msgs = ((InternalEObject)releaseNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__RELEASE_NOTES, null, msgs);
			if (newReleaseNotes != null)
				msgs = ((InternalEObject)newReleaseNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__RELEASE_NOTES, null, msgs);
			msgs = basicSetReleaseNotes(newReleaseNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__RELEASE_NOTES, newReleaseNotes, newReleaseNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelCardType getModelCard() {
		return modelCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelCard(ModelCardType newModelCard, NotificationChain msgs) {
		ModelCardType oldModelCard = modelCard;
		modelCard = newModelCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MODEL_CARD, oldModelCard, newModelCard);
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
	public void setModelCard(ModelCardType newModelCard) {
		if (newModelCard != modelCard) {
			NotificationChain msgs = null;
			if (modelCard != null)
				msgs = ((InternalEObject)modelCard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__MODEL_CARD, null, msgs);
			if (newModelCard != null)
				msgs = ((InternalEObject)newModelCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__MODEL_CARD, null, msgs);
			msgs = basicSetModelCard(newModelCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MODEL_CARD, newModelCard, newModelCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentDataType> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ComponentDataType>(ComponentDataType.class, this, BOMPackage.COMPONENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoPropertiesType getCryptoProperties() {
		return cryptoProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCryptoProperties(CryptoPropertiesType newCryptoProperties, NotificationChain msgs) {
		CryptoPropertiesType oldCryptoProperties = cryptoProperties;
		cryptoProperties = newCryptoProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__CRYPTO_PROPERTIES, oldCryptoProperties, newCryptoProperties);
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
	public void setCryptoProperties(CryptoPropertiesType newCryptoProperties) {
		if (newCryptoProperties != cryptoProperties) {
			NotificationChain msgs = null;
			if (cryptoProperties != null)
				msgs = ((InternalEObject)cryptoProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__CRYPTO_PROPERTIES, null, msgs);
			if (newCryptoProperties != null)
				msgs = ((InternalEObject)newCryptoProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__CRYPTO_PROPERTIES, null, msgs);
			msgs = basicSetCryptoProperties(newCryptoProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__CRYPTO_PROPERTIES, newCryptoProperties, newCryptoProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagsType getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(TagsType newTags, NotificationChain msgs) {
		TagsType oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__TAGS, oldTags, newTags);
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
	public void setTags(TagsType newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.COMPONENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classification getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Classification newType) {
		Classification oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		Classification oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.COMPONENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.COMPONENT__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.COMPONENT__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case BOMPackage.COMPONENT__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case BOMPackage.COMPONENT__AUTHORS:
				return basicSetAuthors(null, msgs);
			case BOMPackage.COMPONENT__HASHES:
				return basicSetHashes(null, msgs);
			case BOMPackage.COMPONENT__LICENSES:
				return basicSetLicenses(null, msgs);
			case BOMPackage.COMPONENT__SWID:
				return basicSetSwid(null, msgs);
			case BOMPackage.COMPONENT__PEDIGREE:
				return basicSetPedigree(null, msgs);
			case BOMPackage.COMPONENT__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.COMPONENT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.COMPONENT__COMPONENTS:
				return basicSetComponents(null, msgs);
			case BOMPackage.COMPONENT__EVIDENCE:
				return basicSetEvidence(null, msgs);
			case BOMPackage.COMPONENT__RELEASE_NOTES:
				return basicSetReleaseNotes(null, msgs);
			case BOMPackage.COMPONENT__MODEL_CARD:
				return basicSetModelCard(null, msgs);
			case BOMPackage.COMPONENT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPONENT__CRYPTO_PROPERTIES:
				return basicSetCryptoProperties(null, msgs);
			case BOMPackage.COMPONENT__TAGS:
				return basicSetTags(null, msgs);
			case BOMPackage.COMPONENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPONENT__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.COMPONENT__SUPPLIER:
				return getSupplier();
			case BOMPackage.COMPONENT__MANUFACTURER:
				return getManufacturer();
			case BOMPackage.COMPONENT__AUTHORS:
				return getAuthors();
			case BOMPackage.COMPONENT__AUTHOR:
				return getAuthor();
			case BOMPackage.COMPONENT__PUBLISHER:
				return getPublisher();
			case BOMPackage.COMPONENT__GROUP:
				return getGroup();
			case BOMPackage.COMPONENT__NAME:
				return getName();
			case BOMPackage.COMPONENT__VERSION:
				return getVersion();
			case BOMPackage.COMPONENT__DESCRIPTION:
				return getDescription();
			case BOMPackage.COMPONENT__SCOPE:
				return getScope();
			case BOMPackage.COMPONENT__HASHES:
				return getHashes();
			case BOMPackage.COMPONENT__LICENSES:
				return getLicenses();
			case BOMPackage.COMPONENT__COPYRIGHT:
				return getCopyright();
			case BOMPackage.COMPONENT__CPE:
				return getCpe();
			case BOMPackage.COMPONENT__PURL:
				return getPurl();
			case BOMPackage.COMPONENT__OMNIBOR_ID:
				return getOmniborId();
			case BOMPackage.COMPONENT__SWHID:
				return getSwhid();
			case BOMPackage.COMPONENT__SWID:
				return getSwid();
			case BOMPackage.COMPONENT__MODIFIED:
				return isModified();
			case BOMPackage.COMPONENT__PEDIGREE:
				return getPedigree();
			case BOMPackage.COMPONENT__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.COMPONENT__PROPERTIES:
				return getProperties();
			case BOMPackage.COMPONENT__COMPONENTS:
				return getComponents();
			case BOMPackage.COMPONENT__EVIDENCE:
				return getEvidence();
			case BOMPackage.COMPONENT__RELEASE_NOTES:
				return getReleaseNotes();
			case BOMPackage.COMPONENT__MODEL_CARD:
				return getModelCard();
			case BOMPackage.COMPONENT__DATA:
				return getData();
			case BOMPackage.COMPONENT__CRYPTO_PROPERTIES:
				return getCryptoProperties();
			case BOMPackage.COMPONENT__TAGS:
				return getTags();
			case BOMPackage.COMPONENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.COMPONENT__BOM_REF:
				return getBomRef();
			case BOMPackage.COMPONENT__MIME_TYPE:
				return getMimeType();
			case BOMPackage.COMPONENT__TYPE:
				return getType();
			case BOMPackage.COMPONENT__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case BOMPackage.COMPONENT__SUPPLIER:
				setSupplier((OrganizationalEntity)newValue);
				return;
			case BOMPackage.COMPONENT__MANUFACTURER:
				setManufacturer((OrganizationalEntity)newValue);
				return;
			case BOMPackage.COMPONENT__AUTHORS:
				setAuthors((AuthorsType1)newValue);
				return;
			case BOMPackage.COMPONENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case BOMPackage.COMPONENT__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case BOMPackage.COMPONENT__GROUP:
				setGroup((String)newValue);
				return;
			case BOMPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case BOMPackage.COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.COMPONENT__SCOPE:
				setScope((Scope)newValue);
				return;
			case BOMPackage.COMPONENT__HASHES:
				setHashes((HashesType)newValue);
				return;
			case BOMPackage.COMPONENT__LICENSES:
				setLicenses((LicenseChoiceType)newValue);
				return;
			case BOMPackage.COMPONENT__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case BOMPackage.COMPONENT__CPE:
				setCpe((String)newValue);
				return;
			case BOMPackage.COMPONENT__PURL:
				setPurl((String)newValue);
				return;
			case BOMPackage.COMPONENT__OMNIBOR_ID:
				getOmniborId().clear();
				getOmniborId().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.COMPONENT__SWHID:
				getSwhid().clear();
				getSwhid().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.COMPONENT__SWID:
				setSwid((SwidType)newValue);
				return;
			case BOMPackage.COMPONENT__MODIFIED:
				setModified((Boolean)newValue);
				return;
			case BOMPackage.COMPONENT__PEDIGREE:
				setPedigree((PedigreeType)newValue);
				return;
			case BOMPackage.COMPONENT__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.COMPONENT__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.COMPONENT__COMPONENTS:
				setComponents((ComponentsType)newValue);
				return;
			case BOMPackage.COMPONENT__EVIDENCE:
				setEvidence((ComponentEvidenceType)newValue);
				return;
			case BOMPackage.COMPONENT__RELEASE_NOTES:
				setReleaseNotes((ReleaseNotesType)newValue);
				return;
			case BOMPackage.COMPONENT__MODEL_CARD:
				setModelCard((ModelCardType)newValue);
				return;
			case BOMPackage.COMPONENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ComponentDataType>)newValue);
				return;
			case BOMPackage.COMPONENT__CRYPTO_PROPERTIES:
				setCryptoProperties((CryptoPropertiesType)newValue);
				return;
			case BOMPackage.COMPONENT__TAGS:
				setTags((TagsType)newValue);
				return;
			case BOMPackage.COMPONENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.COMPONENT__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.COMPONENT__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case BOMPackage.COMPONENT__TYPE:
				setType((Classification)newValue);
				return;
			case BOMPackage.COMPONENT__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.COMPONENT__SUPPLIER:
				setSupplier((OrganizationalEntity)null);
				return;
			case BOMPackage.COMPONENT__MANUFACTURER:
				setManufacturer((OrganizationalEntity)null);
				return;
			case BOMPackage.COMPONENT__AUTHORS:
				setAuthors((AuthorsType1)null);
				return;
			case BOMPackage.COMPONENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__SCOPE:
				unsetScope();
				return;
			case BOMPackage.COMPONENT__HASHES:
				setHashes((HashesType)null);
				return;
			case BOMPackage.COMPONENT__LICENSES:
				setLicenses((LicenseChoiceType)null);
				return;
			case BOMPackage.COMPONENT__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__CPE:
				setCpe(CPE_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__PURL:
				setPurl(PURL_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__OMNIBOR_ID:
				getOmniborId().clear();
				return;
			case BOMPackage.COMPONENT__SWHID:
				getSwhid().clear();
				return;
			case BOMPackage.COMPONENT__SWID:
				setSwid((SwidType)null);
				return;
			case BOMPackage.COMPONENT__MODIFIED:
				unsetModified();
				return;
			case BOMPackage.COMPONENT__PEDIGREE:
				setPedigree((PedigreeType)null);
				return;
			case BOMPackage.COMPONENT__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.COMPONENT__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.COMPONENT__COMPONENTS:
				setComponents((ComponentsType)null);
				return;
			case BOMPackage.COMPONENT__EVIDENCE:
				setEvidence((ComponentEvidenceType)null);
				return;
			case BOMPackage.COMPONENT__RELEASE_NOTES:
				setReleaseNotes((ReleaseNotesType)null);
				return;
			case BOMPackage.COMPONENT__MODEL_CARD:
				setModelCard((ModelCardType)null);
				return;
			case BOMPackage.COMPONENT__DATA:
				getData().clear();
				return;
			case BOMPackage.COMPONENT__CRYPTO_PROPERTIES:
				setCryptoProperties((CryptoPropertiesType)null);
				return;
			case BOMPackage.COMPONENT__TAGS:
				setTags((TagsType)null);
				return;
			case BOMPackage.COMPONENT__ANY:
				getAny().clear();
				return;
			case BOMPackage.COMPONENT__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case BOMPackage.COMPONENT__TYPE:
				unsetType();
				return;
			case BOMPackage.COMPONENT__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.COMPONENT__SUPPLIER:
				return supplier != null;
			case BOMPackage.COMPONENT__MANUFACTURER:
				return manufacturer != null;
			case BOMPackage.COMPONENT__AUTHORS:
				return authors != null;
			case BOMPackage.COMPONENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case BOMPackage.COMPONENT__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
			case BOMPackage.COMPONENT__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case BOMPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BOMPackage.COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.COMPONENT__SCOPE:
				return isSetScope();
			case BOMPackage.COMPONENT__HASHES:
				return hashes != null;
			case BOMPackage.COMPONENT__LICENSES:
				return licenses != null;
			case BOMPackage.COMPONENT__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case BOMPackage.COMPONENT__CPE:
				return CPE_EDEFAULT == null ? cpe != null : !CPE_EDEFAULT.equals(cpe);
			case BOMPackage.COMPONENT__PURL:
				return PURL_EDEFAULT == null ? purl != null : !PURL_EDEFAULT.equals(purl);
			case BOMPackage.COMPONENT__OMNIBOR_ID:
				return omniborId != null && !omniborId.isEmpty();
			case BOMPackage.COMPONENT__SWHID:
				return swhid != null && !swhid.isEmpty();
			case BOMPackage.COMPONENT__SWID:
				return swid != null;
			case BOMPackage.COMPONENT__MODIFIED:
				return isSetModified();
			case BOMPackage.COMPONENT__PEDIGREE:
				return pedigree != null;
			case BOMPackage.COMPONENT__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.COMPONENT__PROPERTIES:
				return properties != null;
			case BOMPackage.COMPONENT__COMPONENTS:
				return components != null;
			case BOMPackage.COMPONENT__EVIDENCE:
				return evidence != null;
			case BOMPackage.COMPONENT__RELEASE_NOTES:
				return releaseNotes != null;
			case BOMPackage.COMPONENT__MODEL_CARD:
				return modelCard != null;
			case BOMPackage.COMPONENT__DATA:
				return data != null && !data.isEmpty();
			case BOMPackage.COMPONENT__CRYPTO_PROPERTIES:
				return cryptoProperties != null;
			case BOMPackage.COMPONENT__TAGS:
				return tags != null;
			case BOMPackage.COMPONENT__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.COMPONENT__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.COMPONENT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case BOMPackage.COMPONENT__TYPE:
				return isSetType();
			case BOMPackage.COMPONENT__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(", group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", cpe: ");
		result.append(cpe);
		result.append(", purl: ");
		result.append(purl);
		result.append(", omniborId: ");
		result.append(omniborId);
		result.append(", swhid: ");
		result.append(swhid);
		result.append(", modified: ");
		if (modifiedESet) result.append(modified); else result.append("<unset>");
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
