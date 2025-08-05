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

import java.util.Collection;

import net.opengis.wms.LegendURLType;
import net.opengis.wms.StyleSheetURLType;
import net.opengis.wms.StyleType;
import net.opengis.wms.StyleURLType;
import net.opengis.wms.WMSPackage;

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
 * An implementation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getLegendURL <em>Legend URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getStyleSheetURL <em>Style Sheet URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.StyleTypeImpl#getStyleURL <em>Style URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleTypeImpl extends MinimalEObjectImpl.Container implements StyleType {
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
	 * The cached value of the '{@link #getLegendURL() <em>Legend URL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendURL()
	 * @generated
	 * @ordered
	 */
	protected EList<LegendURLType> legendURL;

	/**
	 * The cached value of the '{@link #getStyleSheetURL() <em>Style Sheet URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheetURL()
	 * @generated
	 * @ordered
	 */
	protected StyleSheetURLType styleSheetURL;

	/**
	 * The cached value of the '{@link #getStyleURL() <em>Style URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleURL()
	 * @generated
	 * @ordered
	 */
	protected StyleURLType styleURL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.STYLE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegendURLType> getLegendURL() {
		if (legendURL == null) {
			legendURL = new EObjectContainmentEList<LegendURLType>(LegendURLType.class, this, WMSPackage.STYLE_TYPE__LEGEND_URL);
		}
		return legendURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheetURLType getStyleSheetURL() {
		return styleSheetURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleSheetURL(StyleSheetURLType newStyleSheetURL, NotificationChain msgs) {
		StyleSheetURLType oldStyleSheetURL = styleSheetURL;
		styleSheetURL = newStyleSheetURL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__STYLE_SHEET_URL, oldStyleSheetURL, newStyleSheetURL);
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
	public void setStyleSheetURL(StyleSheetURLType newStyleSheetURL) {
		if (newStyleSheetURL != styleSheetURL) {
			NotificationChain msgs = null;
			if (styleSheetURL != null)
				msgs = ((InternalEObject)styleSheetURL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.STYLE_TYPE__STYLE_SHEET_URL, null, msgs);
			if (newStyleSheetURL != null)
				msgs = ((InternalEObject)newStyleSheetURL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.STYLE_TYPE__STYLE_SHEET_URL, null, msgs);
			msgs = basicSetStyleSheetURL(newStyleSheetURL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__STYLE_SHEET_URL, newStyleSheetURL, newStyleSheetURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleURLType getStyleURL() {
		return styleURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleURL(StyleURLType newStyleURL, NotificationChain msgs) {
		StyleURLType oldStyleURL = styleURL;
		styleURL = newStyleURL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__STYLE_URL, oldStyleURL, newStyleURL);
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
	public void setStyleURL(StyleURLType newStyleURL) {
		if (newStyleURL != styleURL) {
			NotificationChain msgs = null;
			if (styleURL != null)
				msgs = ((InternalEObject)styleURL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.STYLE_TYPE__STYLE_URL, null, msgs);
			if (newStyleURL != null)
				msgs = ((InternalEObject)newStyleURL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.STYLE_TYPE__STYLE_URL, null, msgs);
			msgs = basicSetStyleURL(newStyleURL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.STYLE_TYPE__STYLE_URL, newStyleURL, newStyleURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.STYLE_TYPE__LEGEND_URL:
				return ((InternalEList<?>)getLegendURL()).basicRemove(otherEnd, msgs);
			case WMSPackage.STYLE_TYPE__STYLE_SHEET_URL:
				return basicSetStyleSheetURL(null, msgs);
			case WMSPackage.STYLE_TYPE__STYLE_URL:
				return basicSetStyleURL(null, msgs);
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
			case WMSPackage.STYLE_TYPE__NAME:
				return getName();
			case WMSPackage.STYLE_TYPE__TITLE:
				return getTitle();
			case WMSPackage.STYLE_TYPE__ABSTRACT:
				return getAbstract();
			case WMSPackage.STYLE_TYPE__LEGEND_URL:
				return getLegendURL();
			case WMSPackage.STYLE_TYPE__STYLE_SHEET_URL:
				return getStyleSheetURL();
			case WMSPackage.STYLE_TYPE__STYLE_URL:
				return getStyleURL();
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
			case WMSPackage.STYLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case WMSPackage.STYLE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case WMSPackage.STYLE_TYPE__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case WMSPackage.STYLE_TYPE__LEGEND_URL:
				getLegendURL().clear();
				getLegendURL().addAll((Collection<? extends LegendURLType>)newValue);
				return;
			case WMSPackage.STYLE_TYPE__STYLE_SHEET_URL:
				setStyleSheetURL((StyleSheetURLType)newValue);
				return;
			case WMSPackage.STYLE_TYPE__STYLE_URL:
				setStyleURL((StyleURLType)newValue);
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
			case WMSPackage.STYLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WMSPackage.STYLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WMSPackage.STYLE_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case WMSPackage.STYLE_TYPE__LEGEND_URL:
				getLegendURL().clear();
				return;
			case WMSPackage.STYLE_TYPE__STYLE_SHEET_URL:
				setStyleSheetURL((StyleSheetURLType)null);
				return;
			case WMSPackage.STYLE_TYPE__STYLE_URL:
				setStyleURL((StyleURLType)null);
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
			case WMSPackage.STYLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WMSPackage.STYLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WMSPackage.STYLE_TYPE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case WMSPackage.STYLE_TYPE__LEGEND_URL:
				return legendURL != null && !legendURL.isEmpty();
			case WMSPackage.STYLE_TYPE__STYLE_SHEET_URL:
				return styleSheetURL != null;
			case WMSPackage.STYLE_TYPE__STYLE_URL:
				return styleURL != null;
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
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //StyleTypeImpl
