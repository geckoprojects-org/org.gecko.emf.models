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
import net.opengis.kml.RefreshModeEnumType;
import net.opengis.kml.ViewRefreshModeEnumType;

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
 * An implementation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getHttpQuery <em>Http Query</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getLinkSimpleExtensionGroupGroup <em>Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getLinkObjectExtensionGroupGroup <em>Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinkTypeImpl#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkTypeImpl extends BasicLinkTypeImpl implements LinkType {
	/**
	 * The default value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final RefreshModeEnumType REFRESH_MODE_EDEFAULT = RefreshModeEnumType.ON_CHANGE;

	/**
	 * The cached value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected RefreshModeEnumType refreshMode = REFRESH_MODE_EDEFAULT;

	/**
	 * This is true if the Refresh Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshModeESet;

	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REFRESH_INTERVAL_EDEFAULT = 4.0;

	/**
	 * The cached value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected double refreshInterval = REFRESH_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Refresh Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshIntervalESet;

	/**
	 * The default value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final ViewRefreshModeEnumType VIEW_REFRESH_MODE_EDEFAULT = ViewRefreshModeEnumType.NEVER;

	/**
	 * The cached value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected ViewRefreshModeEnumType viewRefreshMode = VIEW_REFRESH_MODE_EDEFAULT;

	/**
	 * This is true if the View Refresh Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewRefreshModeESet;

	/**
	 * The default value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_REFRESH_TIME_EDEFAULT = 4.0;

	/**
	 * The cached value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected double viewRefreshTime = VIEW_REFRESH_TIME_EDEFAULT;

	/**
	 * This is true if the View Refresh Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewRefreshTimeESet;

	/**
	 * The default value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_BOUND_SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected double viewBoundScale = VIEW_BOUND_SCALE_EDEFAULT;

	/**
	 * This is true if the View Bound Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewBoundScaleESet;

	/**
	 * The default value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected String viewFormat = VIEW_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected String httpQuery = HTTP_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkSimpleExtensionGroupGroup() <em>Link Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap linkSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLinkObjectExtensionGroupGroup() <em>Link Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap linkObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLinkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefreshModeEnumType getRefreshMode() {
		return refreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshMode(RefreshModeEnumType newRefreshMode) {
		RefreshModeEnumType oldRefreshMode = refreshMode;
		refreshMode = newRefreshMode == null ? REFRESH_MODE_EDEFAULT : newRefreshMode;
		boolean oldRefreshModeESet = refreshModeESet;
		refreshModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__REFRESH_MODE, oldRefreshMode, refreshMode, !oldRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRefreshMode() {
		RefreshModeEnumType oldRefreshMode = refreshMode;
		boolean oldRefreshModeESet = refreshModeESet;
		refreshMode = REFRESH_MODE_EDEFAULT;
		refreshModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINK_TYPE__REFRESH_MODE, oldRefreshMode, REFRESH_MODE_EDEFAULT, oldRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRefreshMode() {
		return refreshModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRefreshInterval() {
		return refreshInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshInterval(double newRefreshInterval) {
		double oldRefreshInterval = refreshInterval;
		refreshInterval = newRefreshInterval;
		boolean oldRefreshIntervalESet = refreshIntervalESet;
		refreshIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval, !oldRefreshIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRefreshInterval() {
		double oldRefreshInterval = refreshInterval;
		boolean oldRefreshIntervalESet = refreshIntervalESet;
		refreshInterval = REFRESH_INTERVAL_EDEFAULT;
		refreshIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINK_TYPE__REFRESH_INTERVAL, oldRefreshInterval, REFRESH_INTERVAL_EDEFAULT, oldRefreshIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRefreshInterval() {
		return refreshIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewRefreshModeEnumType getViewRefreshMode() {
		return viewRefreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRefreshMode(ViewRefreshModeEnumType newViewRefreshMode) {
		ViewRefreshModeEnumType oldViewRefreshMode = viewRefreshMode;
		viewRefreshMode = newViewRefreshMode == null ? VIEW_REFRESH_MODE_EDEFAULT : newViewRefreshMode;
		boolean oldViewRefreshModeESet = viewRefreshModeESet;
		viewRefreshModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE, oldViewRefreshMode, viewRefreshMode, !oldViewRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetViewRefreshMode() {
		ViewRefreshModeEnumType oldViewRefreshMode = viewRefreshMode;
		boolean oldViewRefreshModeESet = viewRefreshModeESet;
		viewRefreshMode = VIEW_REFRESH_MODE_EDEFAULT;
		viewRefreshModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE, oldViewRefreshMode, VIEW_REFRESH_MODE_EDEFAULT, oldViewRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetViewRefreshMode() {
		return viewRefreshModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViewRefreshTime() {
		return viewRefreshTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRefreshTime(double newViewRefreshTime) {
		double oldViewRefreshTime = viewRefreshTime;
		viewRefreshTime = newViewRefreshTime;
		boolean oldViewRefreshTimeESet = viewRefreshTimeESet;
		viewRefreshTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME, oldViewRefreshTime, viewRefreshTime, !oldViewRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetViewRefreshTime() {
		double oldViewRefreshTime = viewRefreshTime;
		boolean oldViewRefreshTimeESet = viewRefreshTimeESet;
		viewRefreshTime = VIEW_REFRESH_TIME_EDEFAULT;
		viewRefreshTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME, oldViewRefreshTime, VIEW_REFRESH_TIME_EDEFAULT, oldViewRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetViewRefreshTime() {
		return viewRefreshTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViewBoundScale() {
		return viewBoundScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewBoundScale(double newViewBoundScale) {
		double oldViewBoundScale = viewBoundScale;
		viewBoundScale = newViewBoundScale;
		boolean oldViewBoundScaleESet = viewBoundScaleESet;
		viewBoundScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE, oldViewBoundScale, viewBoundScale, !oldViewBoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetViewBoundScale() {
		double oldViewBoundScale = viewBoundScale;
		boolean oldViewBoundScaleESet = viewBoundScaleESet;
		viewBoundScale = VIEW_BOUND_SCALE_EDEFAULT;
		viewBoundScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE, oldViewBoundScale, VIEW_BOUND_SCALE_EDEFAULT, oldViewBoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetViewBoundScale() {
		return viewBoundScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewFormat() {
		return viewFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewFormat(String newViewFormat) {
		String oldViewFormat = viewFormat;
		viewFormat = newViewFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__VIEW_FORMAT, oldViewFormat, viewFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpQuery() {
		return httpQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpQuery(String newHttpQuery) {
		String oldHttpQuery = httpQuery;
		httpQuery = newHttpQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINK_TYPE__HTTP_QUERY, oldHttpQuery, httpQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLinkSimpleExtensionGroupGroup() {
		if (linkSimpleExtensionGroupGroup == null) {
			linkSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return linkSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLinkSimpleExtensionGroup() {
		return getLinkSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLinkType_LinkSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLinkObjectExtensionGroupGroup() {
		if (linkObjectExtensionGroupGroup == null) {
			linkObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return linkObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLinkObjectExtensionGroup() {
		return getLinkObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLinkType_LinkObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLinkSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLinkObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLinkObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LINK_TYPE__REFRESH_MODE:
				return getRefreshMode();
			case KMLPackage.LINK_TYPE__REFRESH_INTERVAL:
				return getRefreshInterval();
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE:
				return getViewRefreshMode();
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME:
				return getViewRefreshTime();
			case KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE:
				return getViewBoundScale();
			case KMLPackage.LINK_TYPE__VIEW_FORMAT:
				return getViewFormat();
			case KMLPackage.LINK_TYPE__HTTP_QUERY:
				return getHttpQuery();
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLinkSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLinkSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP:
				return getLinkSimpleExtensionGroup();
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLinkObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLinkObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP:
				return getLinkObjectExtensionGroup();
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
			case KMLPackage.LINK_TYPE__REFRESH_MODE:
				setRefreshMode((RefreshModeEnumType)newValue);
				return;
			case KMLPackage.LINK_TYPE__REFRESH_INTERVAL:
				setRefreshInterval((Double)newValue);
				return;
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE:
				setViewRefreshMode((ViewRefreshModeEnumType)newValue);
				return;
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME:
				setViewRefreshTime((Double)newValue);
				return;
			case KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE:
				setViewBoundScale((Double)newValue);
				return;
			case KMLPackage.LINK_TYPE__VIEW_FORMAT:
				setViewFormat((String)newValue);
				return;
			case KMLPackage.LINK_TYPE__HTTP_QUERY:
				setHttpQuery((String)newValue);
				return;
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLinkSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLinkObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LINK_TYPE__REFRESH_MODE:
				unsetRefreshMode();
				return;
			case KMLPackage.LINK_TYPE__REFRESH_INTERVAL:
				unsetRefreshInterval();
				return;
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE:
				unsetViewRefreshMode();
				return;
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME:
				unsetViewRefreshTime();
				return;
			case KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE:
				unsetViewBoundScale();
				return;
			case KMLPackage.LINK_TYPE__VIEW_FORMAT:
				setViewFormat(VIEW_FORMAT_EDEFAULT);
				return;
			case KMLPackage.LINK_TYPE__HTTP_QUERY:
				setHttpQuery(HTTP_QUERY_EDEFAULT);
				return;
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				getLinkSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP:
				getLinkObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LINK_TYPE__REFRESH_MODE:
				return isSetRefreshMode();
			case KMLPackage.LINK_TYPE__REFRESH_INTERVAL:
				return isSetRefreshInterval();
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_MODE:
				return isSetViewRefreshMode();
			case KMLPackage.LINK_TYPE__VIEW_REFRESH_TIME:
				return isSetViewRefreshTime();
			case KMLPackage.LINK_TYPE__VIEW_BOUND_SCALE:
				return isSetViewBoundScale();
			case KMLPackage.LINK_TYPE__VIEW_FORMAT:
				return VIEW_FORMAT_EDEFAULT == null ? viewFormat != null : !VIEW_FORMAT_EDEFAULT.equals(viewFormat);
			case KMLPackage.LINK_TYPE__HTTP_QUERY:
				return HTTP_QUERY_EDEFAULT == null ? httpQuery != null : !HTTP_QUERY_EDEFAULT.equals(httpQuery);
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return linkSimpleExtensionGroupGroup != null && !linkSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP:
				return !getLinkSimpleExtensionGroup().isEmpty();
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return linkObjectExtensionGroupGroup != null && !linkObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP:
				return !getLinkObjectExtensionGroup().isEmpty();
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
		result.append(" (refreshMode: ");
		if (refreshModeESet) result.append(refreshMode); else result.append("<unset>");
		result.append(", refreshInterval: ");
		if (refreshIntervalESet) result.append(refreshInterval); else result.append("<unset>");
		result.append(", viewRefreshMode: ");
		if (viewRefreshModeESet) result.append(viewRefreshMode); else result.append("<unset>");
		result.append(", viewRefreshTime: ");
		if (viewRefreshTimeESet) result.append(viewRefreshTime); else result.append("<unset>");
		result.append(", viewBoundScale: ");
		if (viewBoundScaleESet) result.append(viewBoundScale); else result.append("<unset>");
		result.append(", viewFormat: ");
		result.append(viewFormat);
		result.append(", httpQuery: ");
		result.append(httpQuery);
		result.append(", linkSimpleExtensionGroupGroup: ");
		result.append(linkSimpleExtensionGroupGroup);
		result.append(", linkObjectExtensionGroupGroup: ");
		result.append(linkObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LinkTypeImpl
