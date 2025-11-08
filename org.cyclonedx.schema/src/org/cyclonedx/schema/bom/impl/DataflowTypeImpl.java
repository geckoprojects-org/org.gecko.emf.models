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
import org.cyclonedx.schema.bom.DataClassificationType;
import org.cyclonedx.schema.bom.DataGovernance;
import org.cyclonedx.schema.bom.DataflowType;
import org.cyclonedx.schema.bom.DestinationType;
import org.cyclonedx.schema.bom.SourceType;

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
 * An implementation of the model object '<em><b>Dataflow Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getGovernance <em>Governance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataflowTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataflowTypeImpl extends MinimalEObjectImpl.Container implements DataflowType {
	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected DataClassificationType classification;

	/**
	 * The cached value of the '{@link #getGovernance() <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernance()
	 * @generated
	 * @ordered
	 */
	protected DataGovernance governance;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected DestinationType destination;

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
	protected DataflowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getDataflowType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataClassificationType getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(DataClassificationType newClassification, NotificationChain msgs) {
		DataClassificationType oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(DataClassificationType newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataGovernance getGovernance() {
		return governance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGovernance(DataGovernance newGovernance, NotificationChain msgs) {
		DataGovernance oldGovernance = governance;
		governance = newGovernance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__GOVERNANCE, oldGovernance, newGovernance);
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
	public void setGovernance(DataGovernance newGovernance) {
		if (newGovernance != governance) {
			NotificationChain msgs = null;
			if (governance != null)
				msgs = ((InternalEObject)governance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__GOVERNANCE, null, msgs);
			if (newGovernance != null)
				msgs = ((InternalEObject)newGovernance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__GOVERNANCE, null, msgs);
			msgs = basicSetGovernance(newGovernance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__GOVERNANCE, newGovernance, newGovernance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		SourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__SOURCE, oldSource, newSource);
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
	public void setSource(SourceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestinationType getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(DestinationType newDestination, NotificationChain msgs) {
		DestinationType oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(DestinationType newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATAFLOW_TYPE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__DESTINATION, newDestination, newDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATAFLOW_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.DATAFLOW_TYPE__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case BOMPackage.DATAFLOW_TYPE__GOVERNANCE:
				return basicSetGovernance(null, msgs);
			case BOMPackage.DATAFLOW_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case BOMPackage.DATAFLOW_TYPE__DESTINATION:
				return basicSetDestination(null, msgs);
			case BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.DATAFLOW_TYPE__CLASSIFICATION:
				return getClassification();
			case BOMPackage.DATAFLOW_TYPE__GOVERNANCE:
				return getGovernance();
			case BOMPackage.DATAFLOW_TYPE__SOURCE:
				return getSource();
			case BOMPackage.DATAFLOW_TYPE__DESTINATION:
				return getDestination();
			case BOMPackage.DATAFLOW_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.DATAFLOW_TYPE__NAME:
				return getName();
			case BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.DATAFLOW_TYPE__CLASSIFICATION:
				setClassification((DataClassificationType)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__SOURCE:
				setSource((SourceType)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__DESTINATION:
				setDestination((DestinationType)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.DATAFLOW_TYPE__CLASSIFICATION:
				setClassification((DataClassificationType)null);
				return;
			case BOMPackage.DATAFLOW_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)null);
				return;
			case BOMPackage.DATAFLOW_TYPE__SOURCE:
				setSource((SourceType)null);
				return;
			case BOMPackage.DATAFLOW_TYPE__DESTINATION:
				setDestination((DestinationType)null);
				return;
			case BOMPackage.DATAFLOW_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.DATAFLOW_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.DATAFLOW_TYPE__CLASSIFICATION:
				return classification != null;
			case BOMPackage.DATAFLOW_TYPE__GOVERNANCE:
				return governance != null;
			case BOMPackage.DATAFLOW_TYPE__SOURCE:
				return source != null;
			case BOMPackage.DATAFLOW_TYPE__DESTINATION:
				return destination != null;
			case BOMPackage.DATAFLOW_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.DATAFLOW_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.DATAFLOW_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DataflowTypeImpl
