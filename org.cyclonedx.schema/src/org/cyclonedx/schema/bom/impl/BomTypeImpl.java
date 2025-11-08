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

import java.math.BigInteger;

import org.cyclonedx.schema.bom.AnnotationsType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.BomType;
import org.cyclonedx.schema.bom.ComponentsType2;
import org.cyclonedx.schema.bom.CompositionsType;
import org.cyclonedx.schema.bom.DeclarationsType;
import org.cyclonedx.schema.bom.DefinitionsType;
import org.cyclonedx.schema.bom.DependenciesType1;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.FormulationType;
import org.cyclonedx.schema.bom.Metadata;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ServicesType2;
import org.cyclonedx.schema.bom.VulnerabilitiesType;

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
 * An implementation of the model object '<em><b>Bom Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getFormulation <em>Formulation</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.BomTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BomTypeImpl extends MinimalEObjectImpl.Container implements BomType {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType2 components;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesType2 services;

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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType1 dependencies;

	/**
	 * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositions()
	 * @generated
	 * @ordered
	 */
	protected CompositionsType compositions;

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
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected VulnerabilitiesType vulnerabilities;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

	/**
	 * The cached value of the '{@link #getFormulation() <em>Formulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulation()
	 * @generated
	 * @ordered
	 */
	protected FormulationType formulation;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected DeclarationsType declarations;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected DefinitionsType definitions;

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
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

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
	protected BomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getBomType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__METADATA, oldMetadata, newMetadata);
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
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentsType2 newComponents, NotificationChain msgs) {
		ComponentsType2 oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(ComponentsType2 newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType2 getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(ServicesType2 newServices, NotificationChain msgs) {
		ServicesType2 oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__SERVICES, oldServices, newServices);
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
	public void setServices(ServicesType2 newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__SERVICES, newServices, newServices));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType1 getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependenciesType1 newDependencies, NotificationChain msgs) {
		DependenciesType1 oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
	public void setDependencies(DependenciesType1 newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DEPENDENCIES, newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionsType getCompositions() {
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositions(CompositionsType newCompositions, NotificationChain msgs) {
		CompositionsType oldCompositions = compositions;
		compositions = newCompositions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__COMPOSITIONS, oldCompositions, newCompositions);
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
	public void setCompositions(CompositionsType newCompositions) {
		if (newCompositions != compositions) {
			NotificationChain msgs = null;
			if (compositions != null)
				msgs = ((InternalEObject)compositions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__COMPOSITIONS, null, msgs);
			if (newCompositions != null)
				msgs = ((InternalEObject)newCompositions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__COMPOSITIONS, null, msgs);
			msgs = basicSetCompositions(newCompositions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__COMPOSITIONS, newCompositions, newCompositions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilitiesType getVulnerabilities() {
		return vulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVulnerabilities(VulnerabilitiesType newVulnerabilities, NotificationChain msgs) {
		VulnerabilitiesType oldVulnerabilities = vulnerabilities;
		vulnerabilities = newVulnerabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__VULNERABILITIES, oldVulnerabilities, newVulnerabilities);
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
	public void setVulnerabilities(VulnerabilitiesType newVulnerabilities) {
		if (newVulnerabilities != vulnerabilities) {
			NotificationChain msgs = null;
			if (vulnerabilities != null)
				msgs = ((InternalEObject)vulnerabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__VULNERABILITIES, null, msgs);
			if (newVulnerabilities != null)
				msgs = ((InternalEObject)newVulnerabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__VULNERABILITIES, null, msgs);
			msgs = basicSetVulnerabilities(newVulnerabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__VULNERABILITIES, newVulnerabilities, newVulnerabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulationType getFormulation() {
		return formulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormulation(FormulationType newFormulation, NotificationChain msgs) {
		FormulationType oldFormulation = formulation;
		formulation = newFormulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__FORMULATION, oldFormulation, newFormulation);
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
	public void setFormulation(FormulationType newFormulation) {
		if (newFormulation != formulation) {
			NotificationChain msgs = null;
			if (formulation != null)
				msgs = ((InternalEObject)formulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__FORMULATION, null, msgs);
			if (newFormulation != null)
				msgs = ((InternalEObject)newFormulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__FORMULATION, null, msgs);
			msgs = basicSetFormulation(newFormulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__FORMULATION, newFormulation, newFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclarationsType getDeclarations() {
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarations(DeclarationsType newDeclarations, NotificationChain msgs) {
		DeclarationsType oldDeclarations = declarations;
		declarations = newDeclarations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DECLARATIONS, oldDeclarations, newDeclarations);
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
	public void setDeclarations(DeclarationsType newDeclarations) {
		if (newDeclarations != declarations) {
			NotificationChain msgs = null;
			if (declarations != null)
				msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DECLARATIONS, null, msgs);
			if (newDeclarations != null)
				msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DECLARATIONS, null, msgs);
			msgs = basicSetDeclarations(newDeclarations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DECLARATIONS, newDeclarations, newDeclarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionsType getDefinitions() {
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(DefinitionsType newDefinitions, NotificationChain msgs) {
		DefinitionsType oldDefinitions = definitions;
		definitions = newDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DEFINITIONS, oldDefinitions, newDefinitions);
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
	public void setDefinitions(DefinitionsType newDefinitions) {
		if (newDefinitions != definitions) {
			NotificationChain msgs = null;
			if (definitions != null)
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.BOM_TYPE__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.BOM_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigInteger newVersion) {
		BigInteger oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.BOM_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		BigInteger oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.BOM_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.BOM_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.BOM_TYPE__METADATA:
				return basicSetMetadata(null, msgs);
			case BOMPackage.BOM_TYPE__COMPONENTS:
				return basicSetComponents(null, msgs);
			case BOMPackage.BOM_TYPE__SERVICES:
				return basicSetServices(null, msgs);
			case BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.BOM_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case BOMPackage.BOM_TYPE__COMPOSITIONS:
				return basicSetCompositions(null, msgs);
			case BOMPackage.BOM_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.BOM_TYPE__VULNERABILITIES:
				return basicSetVulnerabilities(null, msgs);
			case BOMPackage.BOM_TYPE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case BOMPackage.BOM_TYPE__FORMULATION:
				return basicSetFormulation(null, msgs);
			case BOMPackage.BOM_TYPE__DECLARATIONS:
				return basicSetDeclarations(null, msgs);
			case BOMPackage.BOM_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case BOMPackage.BOM_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.BOM_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.BOM_TYPE__METADATA:
				return getMetadata();
			case BOMPackage.BOM_TYPE__COMPONENTS:
				return getComponents();
			case BOMPackage.BOM_TYPE__SERVICES:
				return getServices();
			case BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.BOM_TYPE__DEPENDENCIES:
				return getDependencies();
			case BOMPackage.BOM_TYPE__COMPOSITIONS:
				return getCompositions();
			case BOMPackage.BOM_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.BOM_TYPE__VULNERABILITIES:
				return getVulnerabilities();
			case BOMPackage.BOM_TYPE__ANNOTATIONS:
				return getAnnotations();
			case BOMPackage.BOM_TYPE__FORMULATION:
				return getFormulation();
			case BOMPackage.BOM_TYPE__DECLARATIONS:
				return getDeclarations();
			case BOMPackage.BOM_TYPE__DEFINITIONS:
				return getDefinitions();
			case BOMPackage.BOM_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.BOM_TYPE__SERIAL_NUMBER:
				return getSerialNumber();
			case BOMPackage.BOM_TYPE__VERSION:
				return getVersion();
			case BOMPackage.BOM_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.BOM_TYPE__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case BOMPackage.BOM_TYPE__COMPONENTS:
				setComponents((ComponentsType2)newValue);
				return;
			case BOMPackage.BOM_TYPE__SERVICES:
				setServices((ServicesType2)newValue);
				return;
			case BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.BOM_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType1)newValue);
				return;
			case BOMPackage.BOM_TYPE__COMPOSITIONS:
				setCompositions((CompositionsType)newValue);
				return;
			case BOMPackage.BOM_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.BOM_TYPE__VULNERABILITIES:
				setVulnerabilities((VulnerabilitiesType)newValue);
				return;
			case BOMPackage.BOM_TYPE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case BOMPackage.BOM_TYPE__FORMULATION:
				setFormulation((FormulationType)newValue);
				return;
			case BOMPackage.BOM_TYPE__DECLARATIONS:
				setDeclarations((DeclarationsType)newValue);
				return;
			case BOMPackage.BOM_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case BOMPackage.BOM_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.BOM_TYPE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case BOMPackage.BOM_TYPE__VERSION:
				setVersion((BigInteger)newValue);
				return;
			case BOMPackage.BOM_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.BOM_TYPE__METADATA:
				setMetadata((Metadata)null);
				return;
			case BOMPackage.BOM_TYPE__COMPONENTS:
				setComponents((ComponentsType2)null);
				return;
			case BOMPackage.BOM_TYPE__SERVICES:
				setServices((ServicesType2)null);
				return;
			case BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.BOM_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType1)null);
				return;
			case BOMPackage.BOM_TYPE__COMPOSITIONS:
				setCompositions((CompositionsType)null);
				return;
			case BOMPackage.BOM_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.BOM_TYPE__VULNERABILITIES:
				setVulnerabilities((VulnerabilitiesType)null);
				return;
			case BOMPackage.BOM_TYPE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case BOMPackage.BOM_TYPE__FORMULATION:
				setFormulation((FormulationType)null);
				return;
			case BOMPackage.BOM_TYPE__DECLARATIONS:
				setDeclarations((DeclarationsType)null);
				return;
			case BOMPackage.BOM_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case BOMPackage.BOM_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.BOM_TYPE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case BOMPackage.BOM_TYPE__VERSION:
				unsetVersion();
				return;
			case BOMPackage.BOM_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.BOM_TYPE__METADATA:
				return metadata != null;
			case BOMPackage.BOM_TYPE__COMPONENTS:
				return components != null;
			case BOMPackage.BOM_TYPE__SERVICES:
				return services != null;
			case BOMPackage.BOM_TYPE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.BOM_TYPE__DEPENDENCIES:
				return dependencies != null;
			case BOMPackage.BOM_TYPE__COMPOSITIONS:
				return compositions != null;
			case BOMPackage.BOM_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.BOM_TYPE__VULNERABILITIES:
				return vulnerabilities != null;
			case BOMPackage.BOM_TYPE__ANNOTATIONS:
				return annotations != null;
			case BOMPackage.BOM_TYPE__FORMULATION:
				return formulation != null;
			case BOMPackage.BOM_TYPE__DECLARATIONS:
				return declarations != null;
			case BOMPackage.BOM_TYPE__DEFINITIONS:
				return definitions != null;
			case BOMPackage.BOM_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.BOM_TYPE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case BOMPackage.BOM_TYPE__VERSION:
				return isSetVersion();
			case BOMPackage.BOM_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BomTypeImpl
