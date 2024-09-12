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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.AbstractGMLType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.CodeWithAuthorityType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.MetaDataPropertyType;
import net.opengis.gml.gml.ReferenceType;
import net.opengis.gml.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract GML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getDescriptionReference <em>Description Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGMLTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGMLTypeImpl extends MinimalEObjectImpl.Container implements AbstractGMLType {
	/**
	 * The cached value of the '{@link #getMetaDataProperty() <em>Meta Data Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaDataPropertyType> metaDataProperty;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType description;

	/**
	 * The cached value of the '{@link #getDescriptionReference() <em>Description Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType descriptionReference;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CodeWithAuthorityType identifier;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeType> name;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGMLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGMLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaDataPropertyType> getMetaDataProperty() {
		if (metaDataProperty == null) {
			metaDataProperty = new EObjectContainmentEList<MetaDataPropertyType>(MetaDataPropertyType.class, this, GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY);
		}
		return metaDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringOrRefType newDescription, NotificationChain msgs) {
		StringOrRefType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringOrRefType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getDescriptionReference() {
		return descriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionReference(ReferenceType newDescriptionReference, NotificationChain msgs) {
		ReferenceType oldDescriptionReference = descriptionReference;
		descriptionReference = newDescriptionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE, oldDescriptionReference, newDescriptionReference);
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
	public void setDescriptionReference(ReferenceType newDescriptionReference) {
		if (newDescriptionReference != descriptionReference) {
			NotificationChain msgs = null;
			if (descriptionReference != null)
				msgs = ((InternalEObject)descriptionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE, null, msgs);
			if (newDescriptionReference != null)
				msgs = ((InternalEObject)newDescriptionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE, null, msgs);
			msgs = basicSetDescriptionReference(newDescriptionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE, newDescriptionReference, newDescriptionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(CodeWithAuthorityType newIdentifier, NotificationChain msgs) {
		CodeWithAuthorityType oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(CodeWithAuthorityType newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<CodeType>(CodeType.class, this, GMLPackage.ABSTRACT_GML_TYPE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return ((InternalEList<?>)getMetaDataProperty()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE:
				return basicSetDescriptionReference(null, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return getMetaDataProperty();
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return getDescription();
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE:
				return getDescriptionReference();
			case GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER:
				return getIdentifier();
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return getName();
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				return getId();
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				getMetaDataProperty().addAll((Collection<? extends MetaDataPropertyType>)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE:
				setDescriptionReference((ReferenceType)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER:
				setIdentifier((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends CodeType>)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				setId((String)newValue);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)null);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE:
				setDescriptionReference((ReferenceType)null);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER:
				setIdentifier((CodeWithAuthorityType)null);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return metaDataProperty != null && !metaDataProperty.isEmpty();
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return description != null;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION_REFERENCE:
				return descriptionReference != null;
			case GMLPackage.ABSTRACT_GML_TYPE__IDENTIFIER:
				return identifier != null;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return name != null && !name.isEmpty();
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AbstractGMLTypeImpl
