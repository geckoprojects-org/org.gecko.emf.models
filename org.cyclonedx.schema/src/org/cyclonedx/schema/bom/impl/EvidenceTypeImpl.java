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

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DataType;
import org.cyclonedx.schema.bom.EvidenceType;
import org.cyclonedx.schema.bom.OrganizationalContact;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EvidenceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceTypeImpl extends MinimalEObjectImpl.Container implements EvidenceType {
	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> data;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expires = EXPIRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalContact author;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalContact reviewer;

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
	protected EvidenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEvidenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__PROPERTY_NAME, oldPropertyName, propertyName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataType>(DataType.class, this, BOMPackage.EVIDENCE_TYPE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(XMLGregorianCalendar newCreated) {
		XMLGregorianCalendar oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(XMLGregorianCalendar newExpires) {
		XMLGregorianCalendar oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalContact getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(OrganizationalContact newAuthor, NotificationChain msgs) {
		OrganizationalContact oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(OrganizationalContact newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.EVIDENCE_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.EVIDENCE_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalContact getReviewer() {
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewer(OrganizationalContact newReviewer, NotificationChain msgs) {
		OrganizationalContact oldReviewer = reviewer;
		reviewer = newReviewer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__REVIEWER, oldReviewer, newReviewer);
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
	public void setReviewer(OrganizationalContact newReviewer) {
		if (newReviewer != reviewer) {
			NotificationChain msgs = null;
			if (reviewer != null)
				msgs = ((InternalEObject)reviewer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.EVIDENCE_TYPE__REVIEWER, null, msgs);
			if (newReviewer != null)
				msgs = ((InternalEObject)newReviewer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.EVIDENCE_TYPE__REVIEWER, null, msgs);
			msgs = basicSetReviewer(newReviewer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__REVIEWER, newReviewer, newReviewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.EVIDENCE_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.EVIDENCE_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.EVIDENCE_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case BOMPackage.EVIDENCE_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case BOMPackage.EVIDENCE_TYPE__REVIEWER:
				return basicSetReviewer(null, msgs);
			case BOMPackage.EVIDENCE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.EVIDENCE_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case BOMPackage.EVIDENCE_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.EVIDENCE_TYPE__DATA:
				return getData();
			case BOMPackage.EVIDENCE_TYPE__CREATED:
				return getCreated();
			case BOMPackage.EVIDENCE_TYPE__EXPIRES:
				return getExpires();
			case BOMPackage.EVIDENCE_TYPE__AUTHOR:
				return getAuthor();
			case BOMPackage.EVIDENCE_TYPE__REVIEWER:
				return getReviewer();
			case BOMPackage.EVIDENCE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.EVIDENCE_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.EVIDENCE_TYPE__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataType>)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__CREATED:
				setCreated((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__EXPIRES:
				setExpires((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__AUTHOR:
				setAuthor((OrganizationalContact)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__REVIEWER:
				setReviewer((OrganizationalContact)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.EVIDENCE_TYPE__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case BOMPackage.EVIDENCE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.EVIDENCE_TYPE__DATA:
				getData().clear();
				return;
			case BOMPackage.EVIDENCE_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case BOMPackage.EVIDENCE_TYPE__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case BOMPackage.EVIDENCE_TYPE__AUTHOR:
				setAuthor((OrganizationalContact)null);
				return;
			case BOMPackage.EVIDENCE_TYPE__REVIEWER:
				setReviewer((OrganizationalContact)null);
				return;
			case BOMPackage.EVIDENCE_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.EVIDENCE_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.EVIDENCE_TYPE__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case BOMPackage.EVIDENCE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.EVIDENCE_TYPE__DATA:
				return data != null && !data.isEmpty();
			case BOMPackage.EVIDENCE_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case BOMPackage.EVIDENCE_TYPE__EXPIRES:
				return EXPIRES_EDEFAULT == null ? expires != null : !EXPIRES_EDEFAULT.equals(expires);
			case BOMPackage.EVIDENCE_TYPE__AUTHOR:
				return author != null;
			case BOMPackage.EVIDENCE_TYPE__REVIEWER:
				return reviewer != null;
			case BOMPackage.EVIDENCE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.EVIDENCE_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", description: ");
		result.append(description);
		result.append(", created: ");
		result.append(created);
		result.append(", expires: ");
		result.append(expires);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //EvidenceTypeImpl
