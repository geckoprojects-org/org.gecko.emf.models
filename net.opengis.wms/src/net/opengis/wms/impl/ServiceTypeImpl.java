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
package net.opengis.wms.impl;

import java.math.BigInteger;

import net.opengis.wms.ContactInformationType;
import net.opengis.wms.KeywordListType;
import net.opengis.wms.NameType;
import net.opengis.wms.OnlineResourceType;
import net.opengis.wms.ServiceType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getLayerLimit <em>Layer Limit</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ServiceTypeImpl#getMaxHeight <em>Max Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeImpl extends MinimalEObjectImpl.Container implements ServiceType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final NameType NAME_EDEFAULT = NameType.WMS;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywordList() <em>Keyword List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordList()
	 * @generated
	 * @ordered
	 */
	protected KeywordListType keywordList;

	/**
	 * The cached value of the '{@link #getOnlineResource() <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResource()
	 * @generated
	 * @ordered
	 */
	protected OnlineResourceType onlineResource;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected ContactInformationType contactInformation;

	/**
	 * The default value of the '{@link #getFees() <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected static final String FEES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFees() <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected String fees = FEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessConstraints() <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessConstraints() <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessConstraints()
	 * @generated
	 * @ordered
	 */
	protected String accessConstraints = ACCESS_CONSTRAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayerLimit() <em>Layer Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAYER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerLimit() <em>Layer Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger layerLimit = LAYER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.SERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameType newName) {
		NameType oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetName() {
		NameType oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.SERVICE_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordListType getKeywordList() {
		return keywordList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordList(KeywordListType newKeywordList, NotificationChain msgs) {
		KeywordListType oldKeywordList = keywordList;
		keywordList = newKeywordList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__KEYWORD_LIST, oldKeywordList, newKeywordList);
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
	public void setKeywordList(KeywordListType newKeywordList) {
		if (newKeywordList != keywordList) {
			NotificationChain msgs = null;
			if (keywordList != null)
				msgs = ((InternalEObject)keywordList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__KEYWORD_LIST, null, msgs);
			if (newKeywordList != null)
				msgs = ((InternalEObject)newKeywordList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__KEYWORD_LIST, null, msgs);
			msgs = basicSetKeywordList(newKeywordList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__KEYWORD_LIST, newKeywordList, newKeywordList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineResourceType getOnlineResource() {
		return onlineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlineResource(OnlineResourceType newOnlineResource, NotificationChain msgs) {
		OnlineResourceType oldOnlineResource = onlineResource;
		onlineResource = newOnlineResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE, oldOnlineResource, newOnlineResource);
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
	public void setOnlineResource(OnlineResourceType newOnlineResource) {
		if (newOnlineResource != onlineResource) {
			NotificationChain msgs = null;
			if (onlineResource != null)
				msgs = ((InternalEObject)onlineResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE, null, msgs);
			if (newOnlineResource != null)
				msgs = ((InternalEObject)newOnlineResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE, null, msgs);
			msgs = basicSetOnlineResource(newOnlineResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE, newOnlineResource, newOnlineResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactInformationType getContactInformation() {
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInformation(ContactInformationType newContactInformation, NotificationChain msgs) {
		ContactInformationType oldContactInformation = contactInformation;
		contactInformation = newContactInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION, oldContactInformation, newContactInformation);
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
	public void setContactInformation(ContactInformationType newContactInformation) {
		if (newContactInformation != contactInformation) {
			NotificationChain msgs = null;
			if (contactInformation != null)
				msgs = ((InternalEObject)contactInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION, null, msgs);
			if (newContactInformation != null)
				msgs = ((InternalEObject)newContactInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION, null, msgs);
			msgs = basicSetContactInformation(newContactInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION, newContactInformation, newContactInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFees() {
		return fees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFees(String newFees) {
		String oldFees = fees;
		fees = newFees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__FEES, oldFees, fees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessConstraints() {
		return accessConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessConstraints(String newAccessConstraints) {
		String oldAccessConstraints = accessConstraints;
		accessConstraints = newAccessConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__ACCESS_CONSTRAINTS, oldAccessConstraints, accessConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLayerLimit() {
		return layerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayerLimit(BigInteger newLayerLimit) {
		BigInteger oldLayerLimit = layerLimit;
		layerLimit = newLayerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__LAYER_LIMIT, oldLayerLimit, layerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(BigInteger newMaxWidth) {
		BigInteger oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(BigInteger newMaxHeight) {
		BigInteger oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.SERVICE_TYPE__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.SERVICE_TYPE__KEYWORD_LIST:
				return basicSetKeywordList(null, msgs);
			case WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE:
				return basicSetOnlineResource(null, msgs);
			case WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION:
				return basicSetContactInformation(null, msgs);
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
			case WMSPackage.SERVICE_TYPE__NAME:
				return getName();
			case WMSPackage.SERVICE_TYPE__TITLE:
				return getTitle();
			case WMSPackage.SERVICE_TYPE__ABSTRACT:
				return getAbstract();
			case WMSPackage.SERVICE_TYPE__KEYWORD_LIST:
				return getKeywordList();
			case WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE:
				return getOnlineResource();
			case WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION:
				return getContactInformation();
			case WMSPackage.SERVICE_TYPE__FEES:
				return getFees();
			case WMSPackage.SERVICE_TYPE__ACCESS_CONSTRAINTS:
				return getAccessConstraints();
			case WMSPackage.SERVICE_TYPE__LAYER_LIMIT:
				return getLayerLimit();
			case WMSPackage.SERVICE_TYPE__MAX_WIDTH:
				return getMaxWidth();
			case WMSPackage.SERVICE_TYPE__MAX_HEIGHT:
				return getMaxHeight();
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
			case WMSPackage.SERVICE_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__KEYWORD_LIST:
				setKeywordList((KeywordListType)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION:
				setContactInformation((ContactInformationType)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__FEES:
				setFees((String)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__ACCESS_CONSTRAINTS:
				setAccessConstraints((String)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__LAYER_LIMIT:
				setLayerLimit((BigInteger)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__MAX_WIDTH:
				setMaxWidth((BigInteger)newValue);
				return;
			case WMSPackage.SERVICE_TYPE__MAX_HEIGHT:
				setMaxHeight((BigInteger)newValue);
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
			case WMSPackage.SERVICE_TYPE__NAME:
				unsetName();
				return;
			case WMSPackage.SERVICE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__KEYWORD_LIST:
				setKeywordList((KeywordListType)null);
				return;
			case WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)null);
				return;
			case WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION:
				setContactInformation((ContactInformationType)null);
				return;
			case WMSPackage.SERVICE_TYPE__FEES:
				setFees(FEES_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__ACCESS_CONSTRAINTS:
				setAccessConstraints(ACCESS_CONSTRAINTS_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__LAYER_LIMIT:
				setLayerLimit(LAYER_LIMIT_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case WMSPackage.SERVICE_TYPE__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
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
			case WMSPackage.SERVICE_TYPE__NAME:
				return isSetName();
			case WMSPackage.SERVICE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WMSPackage.SERVICE_TYPE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case WMSPackage.SERVICE_TYPE__KEYWORD_LIST:
				return keywordList != null;
			case WMSPackage.SERVICE_TYPE__ONLINE_RESOURCE:
				return onlineResource != null;
			case WMSPackage.SERVICE_TYPE__CONTACT_INFORMATION:
				return contactInformation != null;
			case WMSPackage.SERVICE_TYPE__FEES:
				return FEES_EDEFAULT == null ? fees != null : !FEES_EDEFAULT.equals(fees);
			case WMSPackage.SERVICE_TYPE__ACCESS_CONSTRAINTS:
				return ACCESS_CONSTRAINTS_EDEFAULT == null ? accessConstraints != null : !ACCESS_CONSTRAINTS_EDEFAULT.equals(accessConstraints);
			case WMSPackage.SERVICE_TYPE__LAYER_LIMIT:
				return LAYER_LIMIT_EDEFAULT == null ? layerLimit != null : !LAYER_LIMIT_EDEFAULT.equals(layerLimit);
			case WMSPackage.SERVICE_TYPE__MAX_WIDTH:
				return MAX_WIDTH_EDEFAULT == null ? maxWidth != null : !MAX_WIDTH_EDEFAULT.equals(maxWidth);
			case WMSPackage.SERVICE_TYPE__MAX_HEIGHT:
				return MAX_HEIGHT_EDEFAULT == null ? maxHeight != null : !MAX_HEIGHT_EDEFAULT.equals(maxHeight);
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", fees: ");
		result.append(fees);
		result.append(", accessConstraints: ");
		result.append(accessConstraints);
		result.append(", layerLimit: ");
		result.append(layerLimit);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(')');
		return result.toString();
	}

} //ServiceTypeImpl
