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

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.AbstractViewType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.NetworkLinkControlType;
import net.opengis.kml.SnippetType;
import net.opengis.kml.UpdateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getMaxSessionLength <em>Max Session Length</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getCookie <em>Cookie</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getNetworkLinkControlSimpleExtensionGroupGroup <em>Network Link Control Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getNetworkLinkControlObjectExtensionGroupGroup <em>Network Link Control Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLinkControlTypeImpl extends MinimalEObjectImpl.Container implements NetworkLinkControlType {
	/**
	 * The default value of the '{@link #getMinRefreshPeriod() <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_REFRESH_PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinRefreshPeriod() <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected double minRefreshPeriod = MIN_REFRESH_PERIOD_EDEFAULT;

	/**
	 * This is true if the Min Refresh Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minRefreshPeriodESet;

	/**
	 * The default value of the '{@link #getMaxSessionLength() <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSessionLength()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SESSION_LENGTH_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getMaxSessionLength() <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSessionLength()
	 * @generated
	 * @ordered
	 */
	protected double maxSessionLength = MAX_SESSION_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max Session Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxSessionLengthESet;

	/**
	 * The default value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected String cookie = COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected String linkName = LINK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkDescription() <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkDescription() <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescription()
	 * @generated
	 * @ordered
	 */
	protected String linkDescription = LINK_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkSnippet() <em>Link Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSnippet()
	 * @generated
	 * @ordered
	 */
	protected SnippetType linkSnippet;

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
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected UpdateType update;

	/**
	 * The cached value of the '{@link #getAbstractViewGroupGroup() <em>Abstract View Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractViewGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractViewGroupGroup;

	/**
	 * The cached value of the '{@link #getNetworkLinkControlSimpleExtensionGroupGroup() <em>Network Link Control Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkControlSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap networkLinkControlSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getNetworkLinkControlObjectExtensionGroupGroup() <em>Network Link Control Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkControlObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap networkLinkControlObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getNetworkLinkControlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinRefreshPeriod() {
		return minRefreshPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRefreshPeriod(double newMinRefreshPeriod) {
		double oldMinRefreshPeriod = minRefreshPeriod;
		minRefreshPeriod = newMinRefreshPeriod;
		boolean oldMinRefreshPeriodESet = minRefreshPeriodESet;
		minRefreshPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD, oldMinRefreshPeriod, minRefreshPeriod, !oldMinRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinRefreshPeriod() {
		double oldMinRefreshPeriod = minRefreshPeriod;
		boolean oldMinRefreshPeriodESet = minRefreshPeriodESet;
		minRefreshPeriod = MIN_REFRESH_PERIOD_EDEFAULT;
		minRefreshPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD, oldMinRefreshPeriod, MIN_REFRESH_PERIOD_EDEFAULT, oldMinRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinRefreshPeriod() {
		return minRefreshPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxSessionLength() {
		return maxSessionLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSessionLength(double newMaxSessionLength) {
		double oldMaxSessionLength = maxSessionLength;
		maxSessionLength = newMaxSessionLength;
		boolean oldMaxSessionLengthESet = maxSessionLengthESet;
		maxSessionLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH, oldMaxSessionLength, maxSessionLength, !oldMaxSessionLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxSessionLength() {
		double oldMaxSessionLength = maxSessionLength;
		boolean oldMaxSessionLengthESet = maxSessionLengthESet;
		maxSessionLength = MAX_SESSION_LENGTH_EDEFAULT;
		maxSessionLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH, oldMaxSessionLength, MAX_SESSION_LENGTH_EDEFAULT, oldMaxSessionLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxSessionLength() {
		return maxSessionLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookie() {
		return cookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookie(String newCookie) {
		String oldCookie = cookie;
		cookie = newCookie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__COOKIE, oldCookie, cookie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkName() {
		return linkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkName(String newLinkName) {
		String oldLinkName = linkName;
		linkName = newLinkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_NAME, oldLinkName, linkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkDescription() {
		return linkDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkDescription(String newLinkDescription) {
		String oldLinkDescription = linkDescription;
		linkDescription = newLinkDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION, oldLinkDescription, linkDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnippetType getLinkSnippet() {
		return linkSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkSnippet(SnippetType newLinkSnippet, NotificationChain msgs) {
		SnippetType oldLinkSnippet = linkSnippet;
		linkSnippet = newLinkSnippet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, oldLinkSnippet, newLinkSnippet);
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
	public void setLinkSnippet(SnippetType newLinkSnippet) {
		if (newLinkSnippet != linkSnippet) {
			NotificationChain msgs = null;
			if (linkSnippet != null)
				msgs = ((InternalEObject)linkSnippet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, null, msgs);
			if (newLinkSnippet != null)
				msgs = ((InternalEObject)newLinkSnippet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, null, msgs);
			msgs = basicSetLinkSnippet(newLinkSnippet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, newLinkSnippet, newLinkSnippet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		UpdateType oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE, oldUpdate, newUpdate);
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
	public void setUpdate(UpdateType newUpdate) {
		if (newUpdate != update) {
			NotificationChain msgs = null;
			if (update != null)
				msgs = ((InternalEObject)update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE, null, msgs);
			if (newUpdate != null)
				msgs = ((InternalEObject)newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE, null, msgs);
			msgs = basicSetUpdate(newUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE, newUpdate, newUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractViewGroupGroup() {
		if (abstractViewGroupGroup == null) {
			abstractViewGroupGroup = new BasicFeatureMap(this, KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP);
		}
		return abstractViewGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractViewType getAbstractViewGroup() {
		return (AbstractViewType)getAbstractViewGroupGroup().get(KMLPackage.eINSTANCE.getNetworkLinkControlType_AbstractViewGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractViewGroup(AbstractViewType newAbstractViewGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractViewGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getNetworkLinkControlType_AbstractViewGroup(), newAbstractViewGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNetworkLinkControlSimpleExtensionGroupGroup() {
		if (networkLinkControlSimpleExtensionGroupGroup == null) {
			networkLinkControlSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return networkLinkControlSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getNetworkLinkControlSimpleExtensionGroup() {
		return getNetworkLinkControlSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getNetworkLinkControlType_NetworkLinkControlSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNetworkLinkControlObjectExtensionGroupGroup() {
		if (networkLinkControlObjectExtensionGroupGroup == null) {
			networkLinkControlObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return networkLinkControlObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getNetworkLinkControlObjectExtensionGroup() {
		return getNetworkLinkControlObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getNetworkLinkControlType_NetworkLinkControlObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return basicSetLinkSnippet(null, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return basicSetUpdate(null, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractViewGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP:
				return basicSetAbstractViewGroup(null, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getNetworkLinkControlSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getNetworkLinkControlObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getNetworkLinkControlObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				return getMinRefreshPeriod();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH:
				return getMaxSessionLength();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				return getCookie();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				return getMessage();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				return getLinkName();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				return getLinkDescription();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return getLinkSnippet();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				return getExpires();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return getUpdate();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				if (coreType) return getAbstractViewGroupGroup();
				return ((FeatureMap.Internal)getAbstractViewGroupGroup()).getWrapper();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getNetworkLinkControlSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getNetworkLinkControlSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP:
				return getNetworkLinkControlSimpleExtensionGroup();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getNetworkLinkControlObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getNetworkLinkControlObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkControlObjectExtensionGroup();
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
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				setMinRefreshPeriod((Double)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH:
				setMaxSessionLength((Double)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				setCookie((String)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				setMessage((String)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				setLinkName((String)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				setLinkDescription((String)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				setLinkSnippet((SnippetType)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				setExpires((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractViewGroupGroup()).set(newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getNetworkLinkControlSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getNetworkLinkControlObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				unsetMinRefreshPeriod();
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH:
				unsetMaxSessionLength();
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				setCookie(COOKIE_EDEFAULT);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				setLinkName(LINK_NAME_EDEFAULT);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				setLinkDescription(LINK_DESCRIPTION_EDEFAULT);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				setLinkSnippet((SnippetType)null);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				getAbstractViewGroupGroup().clear();
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP:
				getNetworkLinkControlSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP:
				getNetworkLinkControlObjectExtensionGroupGroup().clear();
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
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				return isSetMinRefreshPeriod();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH:
				return isSetMaxSessionLength();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				return COOKIE_EDEFAULT == null ? cookie != null : !COOKIE_EDEFAULT.equals(cookie);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				return LINK_DESCRIPTION_EDEFAULT == null ? linkDescription != null : !LINK_DESCRIPTION_EDEFAULT.equals(linkDescription);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return linkSnippet != null;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				return EXPIRES_EDEFAULT == null ? expires != null : !EXPIRES_EDEFAULT.equals(expires);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return update != null;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP:
				return abstractViewGroupGroup != null && !abstractViewGroupGroup.isEmpty();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup() != null;
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP:
				return networkLinkControlSimpleExtensionGroupGroup != null && !networkLinkControlSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP:
				return !getNetworkLinkControlSimpleExtensionGroup().isEmpty();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP:
				return networkLinkControlObjectExtensionGroupGroup != null && !networkLinkControlObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return !getNetworkLinkControlObjectExtensionGroup().isEmpty();
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
		result.append(" (minRefreshPeriod: ");
		if (minRefreshPeriodESet) result.append(minRefreshPeriod); else result.append("<unset>");
		result.append(", maxSessionLength: ");
		if (maxSessionLengthESet) result.append(maxSessionLength); else result.append("<unset>");
		result.append(", cookie: ");
		result.append(cookie);
		result.append(", message: ");
		result.append(message);
		result.append(", linkName: ");
		result.append(linkName);
		result.append(", linkDescription: ");
		result.append(linkDescription);
		result.append(", expires: ");
		result.append(expires);
		result.append(", abstractViewGroupGroup: ");
		result.append(abstractViewGroupGroup);
		result.append(", networkLinkControlSimpleExtensionGroupGroup: ");
		result.append(networkLinkControlSimpleExtensionGroupGroup);
		result.append(", networkLinkControlObjectExtensionGroupGroup: ");
		result.append(networkLinkControlObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //NetworkLinkControlTypeImpl
