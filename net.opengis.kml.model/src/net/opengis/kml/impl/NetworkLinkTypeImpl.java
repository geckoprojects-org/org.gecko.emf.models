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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LinkType;
import net.opengis.kml.NetworkLinkType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getLink1 <em>Link1</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getNetworkLinkSimpleExtensionGroupGroup <em>Network Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getNetworkLinkObjectExtensionGroupGroup <em>Network Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkTypeImpl#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLinkTypeImpl extends AbstractFeatureTypeImpl implements NetworkLinkType {
	/**
	 * The default value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_VISIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean refreshVisibility = REFRESH_VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Refresh Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshVisibilityESet;

	/**
	 * The default value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLY_TO_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected boolean flyToView = FLY_TO_VIEW_EDEFAULT;

	/**
	 * This is true if the Fly To View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flyToViewESet;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected LinkType url;

	/**
	 * The cached value of the '{@link #getLink1() <em>Link1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink1()
	 * @generated
	 * @ordered
	 */
	protected LinkType link1;

	/**
	 * The cached value of the '{@link #getNetworkLinkSimpleExtensionGroupGroup() <em>Network Link Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap networkLinkSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getNetworkLinkObjectExtensionGroupGroup() <em>Network Link Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap networkLinkObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getNetworkLinkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRefreshVisibility() {
		return refreshVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshVisibility(boolean newRefreshVisibility) {
		boolean oldRefreshVisibility = refreshVisibility;
		refreshVisibility = newRefreshVisibility;
		boolean oldRefreshVisibilityESet = refreshVisibilityESet;
		refreshVisibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY, oldRefreshVisibility, refreshVisibility, !oldRefreshVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRefreshVisibility() {
		boolean oldRefreshVisibility = refreshVisibility;
		boolean oldRefreshVisibilityESet = refreshVisibilityESet;
		refreshVisibility = REFRESH_VISIBILITY_EDEFAULT;
		refreshVisibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY, oldRefreshVisibility, REFRESH_VISIBILITY_EDEFAULT, oldRefreshVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRefreshVisibility() {
		return refreshVisibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlyToView() {
		return flyToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlyToView(boolean newFlyToView) {
		boolean oldFlyToView = flyToView;
		flyToView = newFlyToView;
		boolean oldFlyToViewESet = flyToViewESet;
		flyToViewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW, oldFlyToView, flyToView, !oldFlyToViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFlyToView() {
		boolean oldFlyToView = flyToView;
		boolean oldFlyToViewESet = flyToViewESet;
		flyToView = FLY_TO_VIEW_EDEFAULT;
		flyToViewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW, oldFlyToView, FLY_TO_VIEW_EDEFAULT, oldFlyToViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFlyToView() {
		return flyToViewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(LinkType newUrl, NotificationChain msgs) {
		LinkType oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__URL, oldUrl, newUrl);
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
	public void setUrl(LinkType newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_TYPE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_TYPE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLink1() {
		return link1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink1(LinkType newLink1, NotificationChain msgs) {
		LinkType oldLink1 = link1;
		link1 = newLink1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__LINK1, oldLink1, newLink1);
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
	public void setLink1(LinkType newLink1) {
		if (newLink1 != link1) {
			NotificationChain msgs = null;
			if (link1 != null)
				msgs = ((InternalEObject)link1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_TYPE__LINK1, null, msgs);
			if (newLink1 != null)
				msgs = ((InternalEObject)newLink1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_TYPE__LINK1, null, msgs);
			msgs = basicSetLink1(newLink1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_TYPE__LINK1, newLink1, newLink1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNetworkLinkSimpleExtensionGroupGroup() {
		if (networkLinkSimpleExtensionGroupGroup == null) {
			networkLinkSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return networkLinkSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getNetworkLinkSimpleExtensionGroup() {
		return getNetworkLinkSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getNetworkLinkType_NetworkLinkSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNetworkLinkObjectExtensionGroupGroup() {
		if (networkLinkObjectExtensionGroupGroup == null) {
			networkLinkObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return networkLinkObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getNetworkLinkObjectExtensionGroup() {
		return getNetworkLinkObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getNetworkLinkType_NetworkLinkObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.NETWORK_LINK_TYPE__URL:
				return basicSetUrl(null, msgs);
			case KMLPackage.NETWORK_LINK_TYPE__LINK1:
				return basicSetLink1(null, msgs);
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getNetworkLinkSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getNetworkLinkObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getNetworkLinkObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				return isRefreshVisibility();
			case KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				return isFlyToView();
			case KMLPackage.NETWORK_LINK_TYPE__URL:
				return getUrl();
			case KMLPackage.NETWORK_LINK_TYPE__LINK1:
				return getLink1();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getNetworkLinkSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getNetworkLinkSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP:
				return getNetworkLinkSimpleExtensionGroup();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getNetworkLinkObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getNetworkLinkObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkObjectExtensionGroup();
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
			case KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				setRefreshVisibility((Boolean)newValue);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				setFlyToView((Boolean)newValue);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__URL:
				setUrl((LinkType)newValue);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__LINK1:
				setLink1((LinkType)newValue);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getNetworkLinkSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getNetworkLinkObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				unsetRefreshVisibility();
				return;
			case KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				unsetFlyToView();
				return;
			case KMLPackage.NETWORK_LINK_TYPE__URL:
				setUrl((LinkType)null);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__LINK1:
				setLink1((LinkType)null);
				return;
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				getNetworkLinkSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				getNetworkLinkObjectExtensionGroupGroup().clear();
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
			case KMLPackage.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				return isSetRefreshVisibility();
			case KMLPackage.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				return isSetFlyToView();
			case KMLPackage.NETWORK_LINK_TYPE__URL:
				return url != null;
			case KMLPackage.NETWORK_LINK_TYPE__LINK1:
				return link1 != null;
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return networkLinkSimpleExtensionGroupGroup != null && !networkLinkSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP:
				return !getNetworkLinkSimpleExtensionGroup().isEmpty();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return networkLinkObjectExtensionGroupGroup != null && !networkLinkObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return !getNetworkLinkObjectExtensionGroup().isEmpty();
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
		result.append(" (refreshVisibility: ");
		if (refreshVisibilityESet) result.append(refreshVisibility); else result.append("<unset>");
		result.append(", flyToView: ");
		if (flyToViewESet) result.append(flyToView); else result.append("<unset>");
		result.append(", networkLinkSimpleExtensionGroupGroup: ");
		result.append(networkLinkSimpleExtensionGroupGroup);
		result.append(", networkLinkObjectExtensionGroupGroup: ");
		result.append(networkLinkObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //NetworkLinkTypeImpl
