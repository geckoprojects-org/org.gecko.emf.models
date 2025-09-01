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
package net.opengis.ogc.features.impl;

import java.util.Collection;

import net.opengis.ogc.features.Extent;
import net.opengis.ogc.features.FeatureCollection;
import net.opengis.ogc.features.LanguageString;
import net.opengis.ogc.features.OGCFeaturesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.FeatureCollectionImpl#getStorageCrs <em>Storage Crs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureCollectionImpl extends MinimalEObjectImpl.Container implements FeatureCollection {
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
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected String itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected LanguageString title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected LanguageString description;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> link;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected Extent extent;

	/**
	 * The cached value of the '{@link #getCrs() <em>Crs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> crs;

	/**
	 * The default value of the '{@link #getStorageCrs() <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCrs()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageCrs() <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCrs()
	 * @generated
	 * @ordered
	 */
	protected String storageCrs = STORAGE_CRS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.FEATURE_COLLECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemType(String newItemType) {
		String oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageString getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(LanguageString newTitle, NotificationChain msgs) {
		LanguageString oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__TITLE, oldTitle, newTitle);
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
	public void setTitle(LanguageString newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageString getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(LanguageString newDescription, NotificationChain msgs) {
		LanguageString oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(LanguageString newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType>(LinkType.class, this, OGCFeaturesPackage.FEATURE_COLLECTION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(Extent newExtent, NotificationChain msgs) {
		Extent oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT, oldExtent, newExtent);
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
	public void setExtent(Extent newExtent) {
		if (newExtent != extent) {
			NotificationChain msgs = null;
			if (extent != null)
				msgs = ((InternalEObject)extent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT, null, msgs);
			if (newExtent != null)
				msgs = ((InternalEObject)newExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT, null, msgs);
			msgs = basicSetExtent(newExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT, newExtent, newExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCrs() {
		if (crs == null) {
			crs = new EDataTypeEList<String>(String.class, this, OGCFeaturesPackage.FEATURE_COLLECTION__CRS);
		}
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageCrs() {
		return storageCrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageCrs(String newStorageCrs) {
		String oldStorageCrs = storageCrs;
		storageCrs = newStorageCrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.FEATURE_COLLECTION__STORAGE_CRS, oldStorageCrs, storageCrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCFeaturesPackage.FEATURE_COLLECTION__TITLE:
				return basicSetTitle(null, msgs);
			case OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OGCFeaturesPackage.FEATURE_COLLECTION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT:
				return basicSetExtent(null, msgs);
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
			case OGCFeaturesPackage.FEATURE_COLLECTION__ID:
				return getId();
			case OGCFeaturesPackage.FEATURE_COLLECTION__ITEM_TYPE:
				return getItemType();
			case OGCFeaturesPackage.FEATURE_COLLECTION__TITLE:
				return getTitle();
			case OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION:
				return getDescription();
			case OGCFeaturesPackage.FEATURE_COLLECTION__LINK:
				return getLink();
			case OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT:
				return getExtent();
			case OGCFeaturesPackage.FEATURE_COLLECTION__CRS:
				return getCrs();
			case OGCFeaturesPackage.FEATURE_COLLECTION__STORAGE_CRS:
				return getStorageCrs();
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
			case OGCFeaturesPackage.FEATURE_COLLECTION__ID:
				setId((String)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__ITEM_TYPE:
				setItemType((String)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__TITLE:
				setTitle((LanguageString)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION:
				setDescription((LanguageString)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT:
				setExtent((Extent)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__CRS:
				getCrs().clear();
				getCrs().addAll((Collection<? extends String>)newValue);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__STORAGE_CRS:
				setStorageCrs((String)newValue);
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
			case OGCFeaturesPackage.FEATURE_COLLECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__TITLE:
				setTitle((LanguageString)null);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION:
				setDescription((LanguageString)null);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__LINK:
				getLink().clear();
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT:
				setExtent((Extent)null);
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__CRS:
				getCrs().clear();
				return;
			case OGCFeaturesPackage.FEATURE_COLLECTION__STORAGE_CRS:
				setStorageCrs(STORAGE_CRS_EDEFAULT);
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
			case OGCFeaturesPackage.FEATURE_COLLECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OGCFeaturesPackage.FEATURE_COLLECTION__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
			case OGCFeaturesPackage.FEATURE_COLLECTION__TITLE:
				return title != null;
			case OGCFeaturesPackage.FEATURE_COLLECTION__DESCRIPTION:
				return description != null;
			case OGCFeaturesPackage.FEATURE_COLLECTION__LINK:
				return link != null && !link.isEmpty();
			case OGCFeaturesPackage.FEATURE_COLLECTION__EXTENT:
				return extent != null;
			case OGCFeaturesPackage.FEATURE_COLLECTION__CRS:
				return crs != null && !crs.isEmpty();
			case OGCFeaturesPackage.FEATURE_COLLECTION__STORAGE_CRS:
				return STORAGE_CRS_EDEFAULT == null ? storageCrs != null : !STORAGE_CRS_EDEFAULT.equals(storageCrs);
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
		result.append(", itemType: ");
		result.append(itemType);
		result.append(", crs: ");
		result.append(crs);
		result.append(", storageCrs: ");
		result.append(storageCrs);
		result.append(')');
		return result.toString();
	}

} //FeatureCollectionImpl
