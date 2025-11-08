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

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType;
import org.cyclonedx.schema.bom.SecuredByType;
import org.cyclonedx.schema.bom.StateType;
import org.cyclonedx.schema.bom.TypeType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Crypto Material Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getAlgorithmRef <em>Algorithm Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RelatedCryptoMaterialPropertiesTypeImpl#getSecuredBy <em>Secured By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedCryptoMaterialPropertiesTypeImpl extends MinimalEObjectImpl.Container implements RelatedCryptoMaterialPropertiesType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType1 TYPE_EDEFAULT = TypeType1.PRIVATE_KEY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType1 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType STATE_EDEFAULT = StateType.PRE_ACTIVATION;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getAlgorithmRef() <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmRef() <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected String algorithmRef = ALGORITHM_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationDate() <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar activationDate = ACTIVATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updateDate = UPDATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuredBy() <em>Secured By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredBy()
	 * @generated
	 * @ordered
	 */
	protected SecuredByType securedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedCryptoMaterialPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getRelatedCryptoMaterialPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType1 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType1 newType) {
		TypeType1 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType1 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(StateType newState) {
		StateType oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetState() {
		StateType oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmRef() {
		return algorithmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmRef(String newAlgorithmRef) {
		String oldAlgorithmRef = algorithmRef;
		algorithmRef = newAlgorithmRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF, oldAlgorithmRef, algorithmRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getActivationDate() {
		return activationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationDate(XMLGregorianCalendar newActivationDate) {
		XMLGregorianCalendar oldActivationDate = activationDate;
		activationDate = newActivationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE, oldActivationDate, activationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(XMLGregorianCalendar newUpdateDate) {
		XMLGregorianCalendar oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationDate(XMLGregorianCalendar newExpirationDate) {
		XMLGregorianCalendar oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(BigInteger newSize) {
		BigInteger oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuredByType getSecuredBy() {
		return securedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuredBy(SecuredByType newSecuredBy, NotificationChain msgs) {
		SecuredByType oldSecuredBy = securedBy;
		securedBy = newSecuredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY, oldSecuredBy, newSecuredBy);
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
	public void setSecuredBy(SecuredByType newSecuredBy) {
		if (newSecuredBy != securedBy) {
			NotificationChain msgs = null;
			if (securedBy != null)
				msgs = ((InternalEObject)securedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY, null, msgs);
			if (newSecuredBy != null)
				msgs = ((InternalEObject)newSecuredBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY, null, msgs);
			msgs = basicSetSecuredBy(newSecuredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY, newSecuredBy, newSecuredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY:
				return basicSetSecuredBy(null, msgs);
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
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE:
				return getType();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID:
				return getId();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE:
				return getState();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF:
				return getAlgorithmRef();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE:
				return getCreationDate();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE:
				return getActivationDate();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE:
				return getUpdateDate();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE:
				return getExpirationDate();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE:
				return getValue();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE:
				return getSize();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT:
				return getFormat();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY:
				return getSecuredBy();
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
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE:
				setType((TypeType1)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID:
				setId((String)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE:
				setState((StateType)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF:
				setAlgorithmRef((String)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE:
				setActivationDate((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE:
				setUpdateDate((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE:
				setExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE:
				setSize((BigInteger)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT:
				setFormat((String)newValue);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY:
				setSecuredBy((SecuredByType)newValue);
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
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE:
				unsetType();
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE:
				unsetState();
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF:
				setAlgorithmRef(ALGORITHM_REF_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE:
				setActivationDate(ACTIVATION_DATE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY:
				setSecuredBy((SecuredByType)null);
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
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__TYPE:
				return isSetType();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__STATE:
				return isSetState();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ALGORITHM_REF:
				return ALGORITHM_REF_EDEFAULT == null ? algorithmRef != null : !ALGORITHM_REF_EDEFAULT.equals(algorithmRef);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__ACTIVATION_DATE:
				return ACTIVATION_DATE_EDEFAULT == null ? activationDate != null : !ACTIVATION_DATE_EDEFAULT.equals(activationDate);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? updateDate != null : !UPDATE_DATE_EDEFAULT.equals(updateDate);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE__SECURED_BY:
				return securedBy != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", algorithmRef: ");
		result.append(algorithmRef);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", activationDate: ");
		result.append(activationDate);
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", value: ");
		result.append(value);
		result.append(", size: ");
		result.append(size);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //RelatedCryptoMaterialPropertiesTypeImpl
