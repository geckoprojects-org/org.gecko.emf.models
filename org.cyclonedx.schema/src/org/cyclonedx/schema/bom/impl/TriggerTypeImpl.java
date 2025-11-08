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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ConditionsType;
import org.cyclonedx.schema.bom.EventType;
import org.cyclonedx.schema.bom.InputsType;
import org.cyclonedx.schema.bom.OutputsType;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ResourceReferencesType;
import org.cyclonedx.schema.bom.TriggerType;
import org.cyclonedx.schema.bom.TriggerTypeType;

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
 * An implementation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getTimeActivated <em>Time Activated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TriggerTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerTypeImpl extends MinimalEObjectImpl.Container implements TriggerType {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

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
	 * The cached value of the '{@link #getResourceReferences() <em>Resource References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceReferences()
	 * @generated
	 * @ordered
	 */
	protected ResourceReferencesType resourceReferences;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerTypeType TYPE_EDEFAULT = TriggerTypeType.MANUAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TriggerTypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EventType event;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected ConditionsType conditions;

	/**
	 * The default value of the '{@link #getTimeActivated() <em>Time Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeActivated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_ACTIVATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeActivated() <em>Time Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeActivated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeActivated = TIME_ACTIVATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected InputsType inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected OutputsType outputs;

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
	protected TriggerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getTriggerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferencesType getResourceReferences() {
		return resourceReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceReferences(ResourceReferencesType newResourceReferences, NotificationChain msgs) {
		ResourceReferencesType oldResourceReferences = resourceReferences;
		resourceReferences = newResourceReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES, oldResourceReferences, newResourceReferences);
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
	public void setResourceReferences(ResourceReferencesType newResourceReferences) {
		if (newResourceReferences != resourceReferences) {
			NotificationChain msgs = null;
			if (resourceReferences != null)
				msgs = ((InternalEObject)resourceReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES, null, msgs);
			if (newResourceReferences != null)
				msgs = ((InternalEObject)newResourceReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES, null, msgs);
			msgs = basicSetResourceReferences(newResourceReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES, newResourceReferences, newResourceReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerTypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TriggerTypeType newType) {
		TriggerTypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TriggerTypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.TRIGGER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public EventType getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventType newEvent, NotificationChain msgs) {
		EventType oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__EVENT, oldEvent, newEvent);
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
	public void setEvent(EventType newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionsType getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(ConditionsType newConditions, NotificationChain msgs) {
		ConditionsType oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__CONDITIONS, oldConditions, newConditions);
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
	public void setConditions(ConditionsType newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__CONDITIONS, newConditions, newConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimeActivated() {
		return timeActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeActivated(XMLGregorianCalendar newTimeActivated) {
		XMLGregorianCalendar oldTimeActivated = timeActivated;
		timeActivated = newTimeActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__TIME_ACTIVATED, oldTimeActivated, timeActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType newInputs, NotificationChain msgs) {
		InputsType oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__INPUTS, oldInputs, newInputs);
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
	public void setInputs(InputsType newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(OutputsType newOutputs, NotificationChain msgs) {
		OutputsType oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__OUTPUTS, oldOutputs, newOutputs);
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
	public void setOutputs(OutputsType newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__OUTPUTS, newOutputs, newOutputs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TRIGGER_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.TRIGGER_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TRIGGER_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES:
				return basicSetResourceReferences(null, msgs);
			case BOMPackage.TRIGGER_TYPE__EVENT:
				return basicSetEvent(null, msgs);
			case BOMPackage.TRIGGER_TYPE__CONDITIONS:
				return basicSetConditions(null, msgs);
			case BOMPackage.TRIGGER_TYPE__INPUTS:
				return basicSetInputs(null, msgs);
			case BOMPackage.TRIGGER_TYPE__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case BOMPackage.TRIGGER_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.TRIGGER_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TRIGGER_TYPE__UID:
				return getUid();
			case BOMPackage.TRIGGER_TYPE__NAME:
				return getName();
			case BOMPackage.TRIGGER_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES:
				return getResourceReferences();
			case BOMPackage.TRIGGER_TYPE__TYPE:
				return getType();
			case BOMPackage.TRIGGER_TYPE__EVENT:
				return getEvent();
			case BOMPackage.TRIGGER_TYPE__CONDITIONS:
				return getConditions();
			case BOMPackage.TRIGGER_TYPE__TIME_ACTIVATED:
				return getTimeActivated();
			case BOMPackage.TRIGGER_TYPE__INPUTS:
				return getInputs();
			case BOMPackage.TRIGGER_TYPE__OUTPUTS:
				return getOutputs();
			case BOMPackage.TRIGGER_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.TRIGGER_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.TRIGGER_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TRIGGER_TYPE__UID:
				setUid((String)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES:
				setResourceReferences((ResourceReferencesType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__TYPE:
				setType((TriggerTypeType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__EVENT:
				setEvent((EventType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__CONDITIONS:
				setConditions((ConditionsType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__TIME_ACTIVATED:
				setTimeActivated((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__INPUTS:
				setInputs((InputsType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__OUTPUTS:
				setOutputs((OutputsType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TRIGGER_TYPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case BOMPackage.TRIGGER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.TRIGGER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES:
				setResourceReferences((ResourceReferencesType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__TYPE:
				unsetType();
				return;
			case BOMPackage.TRIGGER_TYPE__EVENT:
				setEvent((EventType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__CONDITIONS:
				setConditions((ConditionsType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__TIME_ACTIVATED:
				setTimeActivated(TIME_ACTIVATED_EDEFAULT);
				return;
			case BOMPackage.TRIGGER_TYPE__INPUTS:
				setInputs((InputsType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__OUTPUTS:
				setOutputs((OutputsType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.TRIGGER_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.TRIGGER_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.TRIGGER_TYPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case BOMPackage.TRIGGER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.TRIGGER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.TRIGGER_TYPE__RESOURCE_REFERENCES:
				return resourceReferences != null;
			case BOMPackage.TRIGGER_TYPE__TYPE:
				return isSetType();
			case BOMPackage.TRIGGER_TYPE__EVENT:
				return event != null;
			case BOMPackage.TRIGGER_TYPE__CONDITIONS:
				return conditions != null;
			case BOMPackage.TRIGGER_TYPE__TIME_ACTIVATED:
				return TIME_ACTIVATED_EDEFAULT == null ? timeActivated != null : !TIME_ACTIVATED_EDEFAULT.equals(timeActivated);
			case BOMPackage.TRIGGER_TYPE__INPUTS:
				return inputs != null;
			case BOMPackage.TRIGGER_TYPE__OUTPUTS:
				return outputs != null;
			case BOMPackage.TRIGGER_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.TRIGGER_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.TRIGGER_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.TRIGGER_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", timeActivated: ");
		result.append(timeActivated);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TriggerTypeImpl
