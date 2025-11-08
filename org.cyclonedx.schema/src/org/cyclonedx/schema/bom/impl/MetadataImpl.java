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

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.AuthorsType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.Component;
import org.cyclonedx.schema.bom.LicenseChoiceType;
import org.cyclonedx.schema.bom.LifecyclesType;
import org.cyclonedx.schema.bom.Metadata;
import org.cyclonedx.schema.bom.OrganizationalEntity;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ToolsType3;

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
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getManufacture <em>Manufacture</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MetadataImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLifecycles() <em>Lifecycles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycles()
	 * @generated
	 * @ordered
	 */
	protected LifecyclesType lifecycles;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected ToolsType3 tools;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected AuthorsType authors;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

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
	 * The cached value of the '{@link #getManufacture() <em>Manufacture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacture()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity manufacture;

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
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected LicenseChoiceType licenses;

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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getMetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecyclesType getLifecycles() {
		return lifecycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycles(LifecyclesType newLifecycles, NotificationChain msgs) {
		LifecyclesType oldLifecycles = lifecycles;
		lifecycles = newLifecycles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__LIFECYCLES, oldLifecycles, newLifecycles);
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
	public void setLifecycles(LifecyclesType newLifecycles) {
		if (newLifecycles != lifecycles) {
			NotificationChain msgs = null;
			if (lifecycles != null)
				msgs = ((InternalEObject)lifecycles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__LIFECYCLES, null, msgs);
			if (newLifecycles != null)
				msgs = ((InternalEObject)newLifecycles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__LIFECYCLES, null, msgs);
			msgs = basicSetLifecycles(newLifecycles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__LIFECYCLES, newLifecycles, newLifecycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType3 getTools() {
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTools(ToolsType3 newTools, NotificationChain msgs) {
		ToolsType3 oldTools = tools;
		tools = newTools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__TOOLS, oldTools, newTools);
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
	public void setTools(ToolsType3 newTools) {
		if (newTools != tools) {
			NotificationChain msgs = null;
			if (tools != null)
				msgs = ((InternalEObject)tools).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__TOOLS, null, msgs);
			if (newTools != null)
				msgs = ((InternalEObject)newTools).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__TOOLS, null, msgs);
			msgs = basicSetTools(newTools, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__TOOLS, newTools, newTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorsType getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(AuthorsType newAuthors, NotificationChain msgs) {
		AuthorsType oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__AUTHORS, oldAuthors, newAuthors);
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
	public void setAuthors(AuthorsType newAuthors) {
		if (newAuthors != authors) {
			NotificationChain msgs = null;
			if (authors != null)
				msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__AUTHORS, null, msgs);
			if (newAuthors != null)
				msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__AUTHORS, null, msgs);
			msgs = basicSetAuthors(newAuthors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__AUTHORS, newAuthors, newAuthors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__COMPONENT, oldComponent, newComponent);
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
	public void setComponent(Component newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__COMPONENT, newComponent, newComponent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__MANUFACTURER, oldManufacturer, newManufacturer);
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
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getManufacture() {
		return manufacture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacture(OrganizationalEntity newManufacture, NotificationChain msgs) {
		OrganizationalEntity oldManufacture = manufacture;
		manufacture = newManufacture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__MANUFACTURE, oldManufacture, newManufacture);
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
	public void setManufacture(OrganizationalEntity newManufacture) {
		if (newManufacture != manufacture) {
			NotificationChain msgs = null;
			if (manufacture != null)
				msgs = ((InternalEObject)manufacture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__MANUFACTURE, null, msgs);
			if (newManufacture != null)
				msgs = ((InternalEObject)newManufacture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__MANUFACTURE, null, msgs);
			msgs = basicSetManufacture(newManufacture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__MANUFACTURE, newManufacture, newManufacture));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__SUPPLIER, oldSupplier, newSupplier);
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
				msgs = ((InternalEObject)supplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__SUPPLIER, null, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__SUPPLIER, null, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__SUPPLIER, newSupplier, newSupplier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__LICENSES, oldLicenses, newLicenses);
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
				msgs = ((InternalEObject)licenses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__LICENSES, null, msgs);
			if (newLicenses != null)
				msgs = ((InternalEObject)newLicenses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__LICENSES, null, msgs);
			msgs = basicSetLicenses(newLicenses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__LICENSES, newLicenses, newLicenses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.METADATA__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METADATA__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.METADATA__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.METADATA__ANY_ATTRIBUTE);
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
			case BOMPackage.METADATA__LIFECYCLES:
				return basicSetLifecycles(null, msgs);
			case BOMPackage.METADATA__TOOLS:
				return basicSetTools(null, msgs);
			case BOMPackage.METADATA__AUTHORS:
				return basicSetAuthors(null, msgs);
			case BOMPackage.METADATA__COMPONENT:
				return basicSetComponent(null, msgs);
			case BOMPackage.METADATA__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case BOMPackage.METADATA__MANUFACTURE:
				return basicSetManufacture(null, msgs);
			case BOMPackage.METADATA__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case BOMPackage.METADATA__LICENSES:
				return basicSetLicenses(null, msgs);
			case BOMPackage.METADATA__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.METADATA__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.METADATA__ANY_ATTRIBUTE:
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
			case BOMPackage.METADATA__TIMESTAMP:
				return getTimestamp();
			case BOMPackage.METADATA__LIFECYCLES:
				return getLifecycles();
			case BOMPackage.METADATA__TOOLS:
				return getTools();
			case BOMPackage.METADATA__AUTHORS:
				return getAuthors();
			case BOMPackage.METADATA__COMPONENT:
				return getComponent();
			case BOMPackage.METADATA__MANUFACTURER:
				return getManufacturer();
			case BOMPackage.METADATA__MANUFACTURE:
				return getManufacture();
			case BOMPackage.METADATA__SUPPLIER:
				return getSupplier();
			case BOMPackage.METADATA__LICENSES:
				return getLicenses();
			case BOMPackage.METADATA__PROPERTIES:
				return getProperties();
			case BOMPackage.METADATA__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.METADATA__ANY_ATTRIBUTE:
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
			case BOMPackage.METADATA__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.METADATA__LIFECYCLES:
				setLifecycles((LifecyclesType)newValue);
				return;
			case BOMPackage.METADATA__TOOLS:
				setTools((ToolsType3)newValue);
				return;
			case BOMPackage.METADATA__AUTHORS:
				setAuthors((AuthorsType)newValue);
				return;
			case BOMPackage.METADATA__COMPONENT:
				setComponent((Component)newValue);
				return;
			case BOMPackage.METADATA__MANUFACTURER:
				setManufacturer((OrganizationalEntity)newValue);
				return;
			case BOMPackage.METADATA__MANUFACTURE:
				setManufacture((OrganizationalEntity)newValue);
				return;
			case BOMPackage.METADATA__SUPPLIER:
				setSupplier((OrganizationalEntity)newValue);
				return;
			case BOMPackage.METADATA__LICENSES:
				setLicenses((LicenseChoiceType)newValue);
				return;
			case BOMPackage.METADATA__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.METADATA__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.METADATA__ANY_ATTRIBUTE:
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
			case BOMPackage.METADATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case BOMPackage.METADATA__LIFECYCLES:
				setLifecycles((LifecyclesType)null);
				return;
			case BOMPackage.METADATA__TOOLS:
				setTools((ToolsType3)null);
				return;
			case BOMPackage.METADATA__AUTHORS:
				setAuthors((AuthorsType)null);
				return;
			case BOMPackage.METADATA__COMPONENT:
				setComponent((Component)null);
				return;
			case BOMPackage.METADATA__MANUFACTURER:
				setManufacturer((OrganizationalEntity)null);
				return;
			case BOMPackage.METADATA__MANUFACTURE:
				setManufacture((OrganizationalEntity)null);
				return;
			case BOMPackage.METADATA__SUPPLIER:
				setSupplier((OrganizationalEntity)null);
				return;
			case BOMPackage.METADATA__LICENSES:
				setLicenses((LicenseChoiceType)null);
				return;
			case BOMPackage.METADATA__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.METADATA__ANY:
				getAny().clear();
				return;
			case BOMPackage.METADATA__ANY_ATTRIBUTE:
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
			case BOMPackage.METADATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case BOMPackage.METADATA__LIFECYCLES:
				return lifecycles != null;
			case BOMPackage.METADATA__TOOLS:
				return tools != null;
			case BOMPackage.METADATA__AUTHORS:
				return authors != null;
			case BOMPackage.METADATA__COMPONENT:
				return component != null;
			case BOMPackage.METADATA__MANUFACTURER:
				return manufacturer != null;
			case BOMPackage.METADATA__MANUFACTURE:
				return manufacture != null;
			case BOMPackage.METADATA__SUPPLIER:
				return supplier != null;
			case BOMPackage.METADATA__LICENSES:
				return licenses != null;
			case BOMPackage.METADATA__PROPERTIES:
				return properties != null;
			case BOMPackage.METADATA__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.METADATA__ANY_ATTRIBUTE:
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
