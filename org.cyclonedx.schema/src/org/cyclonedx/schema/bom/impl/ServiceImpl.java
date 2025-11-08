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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DataType1;
import org.cyclonedx.schema.bom.EndpointsType;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.LicenseChoiceType;
import org.cyclonedx.schema.bom.OrganizationalEntity;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ReleaseNotesType;
import org.cyclonedx.schema.bom.Service;
import org.cyclonedx.schema.bom.ServicesType1;
import org.cyclonedx.schema.bom.TagsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#isXTrustBoundary <em>XTrust Boundary</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getTrustZone <em>Trust Zone</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServiceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity provider;

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
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EndpointsType endpoints;

	/**
	 * The default value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected boolean authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * This is true if the Authenticated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticatedESet;

	/**
	 * The default value of the '{@link #isXTrustBoundary() <em>XTrust Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXTrustBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XTRUST_BOUNDARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXTrustBoundary() <em>XTrust Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXTrustBoundary()
	 * @generated
	 * @ordered
	 */
	protected boolean xTrustBoundary = XTRUST_BOUNDARY_EDEFAULT;

	/**
	 * This is true if the XTrust Boundary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xTrustBoundaryESet;

	/**
	 * The default value of the '{@link #getTrustZone() <em>Trust Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustZone() <em>Trust Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustZone()
	 * @generated
	 * @ordered
	 */
	protected String trustZone = TRUST_ZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataType1 data;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesType1 services;

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
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(OrganizationalEntity newProvider, NotificationChain msgs) {
		OrganizationalEntity oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(OrganizationalEntity newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__PROVIDER, newProvider, newProvider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__GROUP, oldGroup, group));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointsType getEndpoints() {
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoints(EndpointsType newEndpoints, NotificationChain msgs) {
		EndpointsType oldEndpoints = endpoints;
		endpoints = newEndpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__ENDPOINTS, oldEndpoints, newEndpoints);
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
	public void setEndpoints(EndpointsType newEndpoints) {
		if (newEndpoints != endpoints) {
			NotificationChain msgs = null;
			if (endpoints != null)
				msgs = ((InternalEObject)endpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__ENDPOINTS, null, msgs);
			if (newEndpoints != null)
				msgs = ((InternalEObject)newEndpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__ENDPOINTS, null, msgs);
			msgs = basicSetEndpoints(newEndpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__ENDPOINTS, newEndpoints, newEndpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticated(boolean newAuthenticated) {
		boolean oldAuthenticated = authenticated;
		authenticated = newAuthenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__AUTHENTICATED, oldAuthenticated, authenticated, !oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuthenticated() {
		boolean oldAuthenticated = authenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticated = AUTHENTICATED_EDEFAULT;
		authenticatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.SERVICE__AUTHENTICATED, oldAuthenticated, AUTHENTICATED_EDEFAULT, oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuthenticated() {
		return authenticatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isXTrustBoundary() {
		return xTrustBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXTrustBoundary(boolean newXTrustBoundary) {
		boolean oldXTrustBoundary = xTrustBoundary;
		xTrustBoundary = newXTrustBoundary;
		boolean oldXTrustBoundaryESet = xTrustBoundaryESet;
		xTrustBoundaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__XTRUST_BOUNDARY, oldXTrustBoundary, xTrustBoundary, !oldXTrustBoundaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXTrustBoundary() {
		boolean oldXTrustBoundary = xTrustBoundary;
		boolean oldXTrustBoundaryESet = xTrustBoundaryESet;
		xTrustBoundary = XTRUST_BOUNDARY_EDEFAULT;
		xTrustBoundaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.SERVICE__XTRUST_BOUNDARY, oldXTrustBoundary, XTRUST_BOUNDARY_EDEFAULT, oldXTrustBoundaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXTrustBoundary() {
		return xTrustBoundaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrustZone() {
		return trustZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustZone(String newTrustZone) {
		String oldTrustZone = trustZone;
		trustZone = newTrustZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__TRUST_ZONE, oldTrustZone, trustZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType1 getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataType1 newData, NotificationChain msgs) {
		DataType1 oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__DATA, oldData, newData);
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
	public void setData(DataType1 newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__DATA, newData, newData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__LICENSES, oldLicenses, newLicenses);
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
				msgs = ((InternalEObject)licenses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__LICENSES, null, msgs);
			if (newLicenses != null)
				msgs = ((InternalEObject)newLicenses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__LICENSES, null, msgs);
			msgs = basicSetLicenses(newLicenses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__LICENSES, newLicenses, newLicenses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType1 getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(ServicesType1 newServices, NotificationChain msgs) {
		ServicesType1 oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__SERVICES, oldServices, newServices);
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
	public void setServices(ServicesType1 newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__SERVICES, newServices, newServices));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__RELEASE_NOTES, oldReleaseNotes, newReleaseNotes);
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
				msgs = ((InternalEObject)releaseNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__RELEASE_NOTES, null, msgs);
			if (newReleaseNotes != null)
				msgs = ((InternalEObject)newReleaseNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__RELEASE_NOTES, null, msgs);
			msgs = basicSetReleaseNotes(newReleaseNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__RELEASE_NOTES, newReleaseNotes, newReleaseNotes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__TAGS, oldTags, newTags);
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
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SERVICE__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.SERVICE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SERVICE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.SERVICE__ANY_ATTRIBUTE);
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
			case BOMPackage.SERVICE__PROVIDER:
				return basicSetProvider(null, msgs);
			case BOMPackage.SERVICE__ENDPOINTS:
				return basicSetEndpoints(null, msgs);
			case BOMPackage.SERVICE__DATA:
				return basicSetData(null, msgs);
			case BOMPackage.SERVICE__LICENSES:
				return basicSetLicenses(null, msgs);
			case BOMPackage.SERVICE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.SERVICE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.SERVICE__SERVICES:
				return basicSetServices(null, msgs);
			case BOMPackage.SERVICE__RELEASE_NOTES:
				return basicSetReleaseNotes(null, msgs);
			case BOMPackage.SERVICE__TAGS:
				return basicSetTags(null, msgs);
			case BOMPackage.SERVICE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.SERVICE__ANY_ATTRIBUTE:
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
			case BOMPackage.SERVICE__PROVIDER:
				return getProvider();
			case BOMPackage.SERVICE__GROUP:
				return getGroup();
			case BOMPackage.SERVICE__NAME:
				return getName();
			case BOMPackage.SERVICE__VERSION:
				return getVersion();
			case BOMPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case BOMPackage.SERVICE__ENDPOINTS:
				return getEndpoints();
			case BOMPackage.SERVICE__AUTHENTICATED:
				return isAuthenticated();
			case BOMPackage.SERVICE__XTRUST_BOUNDARY:
				return isXTrustBoundary();
			case BOMPackage.SERVICE__TRUST_ZONE:
				return getTrustZone();
			case BOMPackage.SERVICE__DATA:
				return getData();
			case BOMPackage.SERVICE__LICENSES:
				return getLicenses();
			case BOMPackage.SERVICE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.SERVICE__PROPERTIES:
				return getProperties();
			case BOMPackage.SERVICE__SERVICES:
				return getServices();
			case BOMPackage.SERVICE__RELEASE_NOTES:
				return getReleaseNotes();
			case BOMPackage.SERVICE__TAGS:
				return getTags();
			case BOMPackage.SERVICE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.SERVICE__BOM_REF:
				return getBomRef();
			case BOMPackage.SERVICE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.SERVICE__PROVIDER:
				setProvider((OrganizationalEntity)newValue);
				return;
			case BOMPackage.SERVICE__GROUP:
				setGroup((String)newValue);
				return;
			case BOMPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.SERVICE__VERSION:
				setVersion((String)newValue);
				return;
			case BOMPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.SERVICE__ENDPOINTS:
				setEndpoints((EndpointsType)newValue);
				return;
			case BOMPackage.SERVICE__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
				return;
			case BOMPackage.SERVICE__XTRUST_BOUNDARY:
				setXTrustBoundary((Boolean)newValue);
				return;
			case BOMPackage.SERVICE__TRUST_ZONE:
				setTrustZone((String)newValue);
				return;
			case BOMPackage.SERVICE__DATA:
				setData((DataType1)newValue);
				return;
			case BOMPackage.SERVICE__LICENSES:
				setLicenses((LicenseChoiceType)newValue);
				return;
			case BOMPackage.SERVICE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.SERVICE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.SERVICE__SERVICES:
				setServices((ServicesType1)newValue);
				return;
			case BOMPackage.SERVICE__RELEASE_NOTES:
				setReleaseNotes((ReleaseNotesType)newValue);
				return;
			case BOMPackage.SERVICE__TAGS:
				setTags((TagsType)newValue);
				return;
			case BOMPackage.SERVICE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.SERVICE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.SERVICE__ANY_ATTRIBUTE:
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
			case BOMPackage.SERVICE__PROVIDER:
				setProvider((OrganizationalEntity)null);
				return;
			case BOMPackage.SERVICE__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case BOMPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.SERVICE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BOMPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.SERVICE__ENDPOINTS:
				setEndpoints((EndpointsType)null);
				return;
			case BOMPackage.SERVICE__AUTHENTICATED:
				unsetAuthenticated();
				return;
			case BOMPackage.SERVICE__XTRUST_BOUNDARY:
				unsetXTrustBoundary();
				return;
			case BOMPackage.SERVICE__TRUST_ZONE:
				setTrustZone(TRUST_ZONE_EDEFAULT);
				return;
			case BOMPackage.SERVICE__DATA:
				setData((DataType1)null);
				return;
			case BOMPackage.SERVICE__LICENSES:
				setLicenses((LicenseChoiceType)null);
				return;
			case BOMPackage.SERVICE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.SERVICE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.SERVICE__SERVICES:
				setServices((ServicesType1)null);
				return;
			case BOMPackage.SERVICE__RELEASE_NOTES:
				setReleaseNotes((ReleaseNotesType)null);
				return;
			case BOMPackage.SERVICE__TAGS:
				setTags((TagsType)null);
				return;
			case BOMPackage.SERVICE__ANY:
				getAny().clear();
				return;
			case BOMPackage.SERVICE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.SERVICE__ANY_ATTRIBUTE:
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
			case BOMPackage.SERVICE__PROVIDER:
				return provider != null;
			case BOMPackage.SERVICE__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case BOMPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.SERVICE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BOMPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.SERVICE__ENDPOINTS:
				return endpoints != null;
			case BOMPackage.SERVICE__AUTHENTICATED:
				return isSetAuthenticated();
			case BOMPackage.SERVICE__XTRUST_BOUNDARY:
				return isSetXTrustBoundary();
			case BOMPackage.SERVICE__TRUST_ZONE:
				return TRUST_ZONE_EDEFAULT == null ? trustZone != null : !TRUST_ZONE_EDEFAULT.equals(trustZone);
			case BOMPackage.SERVICE__DATA:
				return data != null;
			case BOMPackage.SERVICE__LICENSES:
				return licenses != null;
			case BOMPackage.SERVICE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.SERVICE__PROPERTIES:
				return properties != null;
			case BOMPackage.SERVICE__SERVICES:
				return services != null;
			case BOMPackage.SERVICE__RELEASE_NOTES:
				return releaseNotes != null;
			case BOMPackage.SERVICE__TAGS:
				return tags != null;
			case BOMPackage.SERVICE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.SERVICE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.SERVICE__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", authenticated: ");
		if (authenticatedESet) result.append(authenticated); else result.append("<unset>");
		result.append(", xTrustBoundary: ");
		if (xTrustBoundaryESet) result.append(xTrustBoundary); else result.append("<unset>");
		result.append(", trustZone: ");
		result.append(trustZone);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
