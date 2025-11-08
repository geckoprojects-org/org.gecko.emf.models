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

import org.cyclonedx.schema.bom.AttachedTextType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.EnvironmentVarsType;
import org.cyclonedx.schema.bom.OutputType;
import org.cyclonedx.schema.bom.OutputTypeEnum;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ResourceReferenceType;

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
 * An implementation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getEnvironmentVars <em>Environment Vars</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OutputTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputTypeImpl extends MinimalEObjectImpl.Container implements OutputType {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceReferenceType resource;

	/**
	 * The cached value of the '{@link #getEnvironmentVars() <em>Environment Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVars()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentVarsType environmentVars;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected AttachedTextType data;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OutputTypeEnum TYPE_EDEFAULT = OutputTypeEnum.ARTIFACT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OutputTypeEnum type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ResourceReferenceType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ResourceReferenceType target;

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
	protected OutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getOutputType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferenceType getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceReferenceType newResource, NotificationChain msgs) {
		ResourceReferenceType oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__RESOURCE, oldResource, newResource);
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
	public void setResource(ResourceReferenceType newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentVarsType getEnvironmentVars() {
		return environmentVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentVars(EnvironmentVarsType newEnvironmentVars, NotificationChain msgs) {
		EnvironmentVarsType oldEnvironmentVars = environmentVars;
		environmentVars = newEnvironmentVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS, oldEnvironmentVars, newEnvironmentVars);
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
	public void setEnvironmentVars(EnvironmentVarsType newEnvironmentVars) {
		if (newEnvironmentVars != environmentVars) {
			NotificationChain msgs = null;
			if (environmentVars != null)
				msgs = ((InternalEObject)environmentVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS, null, msgs);
			if (newEnvironmentVars != null)
				msgs = ((InternalEObject)newEnvironmentVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS, null, msgs);
			msgs = basicSetEnvironmentVars(newEnvironmentVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS, newEnvironmentVars, newEnvironmentVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachedTextType getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(AttachedTextType newData, NotificationChain msgs) {
		AttachedTextType oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__DATA, oldData, newData);
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
	public void setData(AttachedTextType newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputTypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OutputTypeEnum newType) {
		OutputTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		OutputTypeEnum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.OUTPUT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public ResourceReferenceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ResourceReferenceType newSource, NotificationChain msgs) {
		ResourceReferenceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__SOURCE, oldSource, newSource);
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
	public void setSource(ResourceReferenceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferenceType getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ResourceReferenceType newTarget, NotificationChain msgs) {
		ResourceReferenceType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__TARGET, oldTarget, newTarget);
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
	public void setTarget(ResourceReferenceType newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__TARGET, newTarget, newTarget));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.OUTPUT_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OUTPUT_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.OUTPUT_TYPE__ANY);
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
			anyAttribute = new BasicFeatureMap(this, BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.OUTPUT_TYPE__RESOURCE:
				return basicSetResource(null, msgs);
			case BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS:
				return basicSetEnvironmentVars(null, msgs);
			case BOMPackage.OUTPUT_TYPE__DATA:
				return basicSetData(null, msgs);
			case BOMPackage.OUTPUT_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case BOMPackage.OUTPUT_TYPE__TARGET:
				return basicSetTarget(null, msgs);
			case BOMPackage.OUTPUT_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.OUTPUT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.OUTPUT_TYPE__RESOURCE:
				return getResource();
			case BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS:
				return getEnvironmentVars();
			case BOMPackage.OUTPUT_TYPE__DATA:
				return getData();
			case BOMPackage.OUTPUT_TYPE__TYPE:
				return getType();
			case BOMPackage.OUTPUT_TYPE__SOURCE:
				return getSource();
			case BOMPackage.OUTPUT_TYPE__TARGET:
				return getTarget();
			case BOMPackage.OUTPUT_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.OUTPUT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.OUTPUT_TYPE__RESOURCE:
				setResource((ResourceReferenceType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS:
				setEnvironmentVars((EnvironmentVarsType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__DATA:
				setData((AttachedTextType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__TYPE:
				setType((OutputTypeEnum)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__SOURCE:
				setSource((ResourceReferenceType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__TARGET:
				setTarget((ResourceReferenceType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.OUTPUT_TYPE__RESOURCE:
				setResource((ResourceReferenceType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS:
				setEnvironmentVars((EnvironmentVarsType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__DATA:
				setData((AttachedTextType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__TYPE:
				unsetType();
				return;
			case BOMPackage.OUTPUT_TYPE__SOURCE:
				setSource((ResourceReferenceType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__TARGET:
				setTarget((ResourceReferenceType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.OUTPUT_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.OUTPUT_TYPE__RESOURCE:
				return resource != null;
			case BOMPackage.OUTPUT_TYPE__ENVIRONMENT_VARS:
				return environmentVars != null;
			case BOMPackage.OUTPUT_TYPE__DATA:
				return data != null;
			case BOMPackage.OUTPUT_TYPE__TYPE:
				return isSetType();
			case BOMPackage.OUTPUT_TYPE__SOURCE:
				return source != null;
			case BOMPackage.OUTPUT_TYPE__TARGET:
				return target != null;
			case BOMPackage.OUTPUT_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.OUTPUT_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.OUTPUT_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //OutputTypeImpl
