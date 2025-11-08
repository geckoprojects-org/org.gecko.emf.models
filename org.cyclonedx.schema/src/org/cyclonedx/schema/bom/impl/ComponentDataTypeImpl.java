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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ComponentDataType;
import org.cyclonedx.schema.bom.ComponentDataTypeEnumeration;
import org.cyclonedx.schema.bom.ContentsType1;
import org.cyclonedx.schema.bom.DataGovernance;
import org.cyclonedx.schema.bom.GraphicsCollectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getSensitiveData <em>Sensitive Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getGovernance <em>Governance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentDataTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDataTypeImpl extends MinimalEObjectImpl.Container implements ComponentDataType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentDataTypeEnumeration TYPE_EDEFAULT = ComponentDataTypeEnumeration.SOURCE_CODE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentDataTypeEnumeration type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected ContentsType1 contents;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensitiveData() <em>Sensitive Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveData()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> sensitiveData;

	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected GraphicsCollectionType graphics;

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
	 * The cached value of the '{@link #getGovernance() <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernance()
	 * @generated
	 * @ordered
	 */
	protected DataGovernance governance;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getComponentDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDataTypeEnumeration getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComponentDataTypeEnumeration newType) {
		ComponentDataTypeEnumeration oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		ComponentDataTypeEnumeration oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.COMPONENT_DATA_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentsType1 getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContents(ContentsType1 newContents, NotificationChain msgs) {
		ContentsType1 oldContents = contents;
		contents = newContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__CONTENTS, oldContents, newContents);
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
	public void setContents(ContentsType1 newContents) {
		if (newContents != contents) {
			NotificationChain msgs = null;
			if (contents != null)
				msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__CONTENTS, null, msgs);
			if (newContents != null)
				msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__CONTENTS, null, msgs);
			msgs = basicSetContents(newContents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__CONTENTS, newContents, newContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassification(String newClassification) {
		String oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getSensitiveData() {
		if (sensitiveData == null) {
			sensitiveData = new EObjectContainmentEList<EObject>(EObject.class, this, BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA);
		}
		return sensitiveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicsCollectionType getGraphics() {
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphics(GraphicsCollectionType newGraphics, NotificationChain msgs) {
		GraphicsCollectionType oldGraphics = graphics;
		graphics = newGraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS, oldGraphics, newGraphics);
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
	public void setGraphics(GraphicsCollectionType newGraphics) {
		if (newGraphics != graphics) {
			NotificationChain msgs = null;
			if (graphics != null)
				msgs = ((InternalEObject)graphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS, null, msgs);
			if (newGraphics != null)
				msgs = ((InternalEObject)newGraphics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS, null, msgs);
			msgs = basicSetGraphics(newGraphics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS, newGraphics, newGraphics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE, oldGovernance, newGovernance);
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
				msgs = ((InternalEObject)governance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE, null, msgs);
			if (newGovernance != null)
				msgs = ((InternalEObject)newGovernance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE, null, msgs);
			msgs = basicSetGovernance(newGovernance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE, newGovernance, newGovernance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_DATA_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.COMPONENT_DATA_TYPE__CONTENTS:
				return basicSetContents(null, msgs);
			case BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA:
				return ((InternalEList<?>)getSensitiveData()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS:
				return basicSetGraphics(null, msgs);
			case BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE:
				return basicSetGovernance(null, msgs);
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
			case BOMPackage.COMPONENT_DATA_TYPE__TYPE:
				return getType();
			case BOMPackage.COMPONENT_DATA_TYPE__NAME:
				return getName();
			case BOMPackage.COMPONENT_DATA_TYPE__CONTENTS:
				return getContents();
			case BOMPackage.COMPONENT_DATA_TYPE__CLASSIFICATION:
				return getClassification();
			case BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA:
				return getSensitiveData();
			case BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS:
				return getGraphics();
			case BOMPackage.COMPONENT_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE:
				return getGovernance();
			case BOMPackage.COMPONENT_DATA_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.COMPONENT_DATA_TYPE__TYPE:
				setType((ComponentDataTypeEnumeration)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__CONTENTS:
				setContents((ContentsType1)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA:
				getSensitiveData().clear();
				getSensitiveData().addAll((Collection<? extends EObject>)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS:
				setGraphics((GraphicsCollectionType)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)newValue);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.COMPONENT_DATA_TYPE__TYPE:
				unsetType();
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__CONTENTS:
				setContents((ContentsType1)null);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA:
				getSensitiveData().clear();
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS:
				setGraphics((GraphicsCollectionType)null);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)null);
				return;
			case BOMPackage.COMPONENT_DATA_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.COMPONENT_DATA_TYPE__TYPE:
				return isSetType();
			case BOMPackage.COMPONENT_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.COMPONENT_DATA_TYPE__CONTENTS:
				return contents != null;
			case BOMPackage.COMPONENT_DATA_TYPE__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case BOMPackage.COMPONENT_DATA_TYPE__SENSITIVE_DATA:
				return sensitiveData != null && !sensitiveData.isEmpty();
			case BOMPackage.COMPONENT_DATA_TYPE__GRAPHICS:
				return graphics != null;
			case BOMPackage.COMPONENT_DATA_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.COMPONENT_DATA_TYPE__GOVERNANCE:
				return governance != null;
			case BOMPackage.COMPONENT_DATA_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(", name: ");
		result.append(name);
		result.append(", classification: ");
		result.append(classification);
		result.append(", description: ");
		result.append(description);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //ComponentDataTypeImpl
