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

import net.opengis.wms.AttributionType;
import net.opengis.wms.LogoURLType;
import net.opengis.wms.OnlineResourceType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.AttributionTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.impl.AttributionTypeImpl#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.impl.AttributionTypeImpl#getLogoURL <em>Logo URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributionTypeImpl extends MinimalEObjectImpl.Container implements AttributionType {
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
	 * The cached value of the '{@link #getOnlineResource() <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResource()
	 * @generated
	 * @ordered
	 */
	protected OnlineResourceType onlineResource;

	/**
	 * The cached value of the '{@link #getLogoURL() <em>Logo URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoURL()
	 * @generated
	 * @ordered
	 */
	protected LogoURLType logoURL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.ATTRIBUTION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.ATTRIBUTION_TYPE__TITLE, oldTitle, title));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE, oldOnlineResource, newOnlineResource);
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
				msgs = ((InternalEObject)onlineResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE, null, msgs);
			if (newOnlineResource != null)
				msgs = ((InternalEObject)newOnlineResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE, null, msgs);
			msgs = basicSetOnlineResource(newOnlineResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE, newOnlineResource, newOnlineResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogoURLType getLogoURL() {
		return logoURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogoURL(LogoURLType newLogoURL, NotificationChain msgs) {
		LogoURLType oldLogoURL = logoURL;
		logoURL = newLogoURL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.ATTRIBUTION_TYPE__LOGO_URL, oldLogoURL, newLogoURL);
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
	public void setLogoURL(LogoURLType newLogoURL) {
		if (newLogoURL != logoURL) {
			NotificationChain msgs = null;
			if (logoURL != null)
				msgs = ((InternalEObject)logoURL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.ATTRIBUTION_TYPE__LOGO_URL, null, msgs);
			if (newLogoURL != null)
				msgs = ((InternalEObject)newLogoURL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.ATTRIBUTION_TYPE__LOGO_URL, null, msgs);
			msgs = basicSetLogoURL(newLogoURL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.ATTRIBUTION_TYPE__LOGO_URL, newLogoURL, newLogoURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE:
				return basicSetOnlineResource(null, msgs);
			case WMSPackage.ATTRIBUTION_TYPE__LOGO_URL:
				return basicSetLogoURL(null, msgs);
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
			case WMSPackage.ATTRIBUTION_TYPE__TITLE:
				return getTitle();
			case WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE:
				return getOnlineResource();
			case WMSPackage.ATTRIBUTION_TYPE__LOGO_URL:
				return getLogoURL();
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
			case WMSPackage.ATTRIBUTION_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)newValue);
				return;
			case WMSPackage.ATTRIBUTION_TYPE__LOGO_URL:
				setLogoURL((LogoURLType)newValue);
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
			case WMSPackage.ATTRIBUTION_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)null);
				return;
			case WMSPackage.ATTRIBUTION_TYPE__LOGO_URL:
				setLogoURL((LogoURLType)null);
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
			case WMSPackage.ATTRIBUTION_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WMSPackage.ATTRIBUTION_TYPE__ONLINE_RESOURCE:
				return onlineResource != null;
			case WMSPackage.ATTRIBUTION_TYPE__LOGO_URL:
				return logoURL != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //AttributionTypeImpl
