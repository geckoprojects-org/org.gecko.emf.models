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
import net.opengis.kml.BalloonStyleType;
import net.opengis.kml.IconStyleType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LabelStyleType;
import net.opengis.kml.LineStyleType;
import net.opengis.kml.ListStyleType;
import net.opengis.kml.PolyStyleType;
import net.opengis.kml.StyleType;

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
 * An implementation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getStyleSimpleExtensionGroupGroup <em>Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getStyleObjectExtensionGroupGroup <em>Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleTypeImpl#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleTypeImpl extends AbstractStyleSelectorTypeImpl implements StyleType {
	/**
	 * The cached value of the '{@link #getIconStyle() <em>Icon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconStyle()
	 * @generated
	 * @ordered
	 */
	protected IconStyleType iconStyle;

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected LabelStyleType labelStyle;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyleType lineStyle;

	/**
	 * The cached value of the '{@link #getPolyStyle() <em>Poly Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyStyle()
	 * @generated
	 * @ordered
	 */
	protected PolyStyleType polyStyle;

	/**
	 * The cached value of the '{@link #getBalloonStyle() <em>Balloon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalloonStyle()
	 * @generated
	 * @ordered
	 */
	protected BalloonStyleType balloonStyle;

	/**
	 * The cached value of the '{@link #getListStyle() <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected ListStyleType listStyle;

	/**
	 * The cached value of the '{@link #getStyleSimpleExtensionGroupGroup() <em>Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getStyleObjectExtensionGroupGroup() <em>Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleObjectExtensionGroupGroup;

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
		return KMLPackage.eINSTANCE.getStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IconStyleType getIconStyle() {
		return iconStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconStyle(IconStyleType newIconStyle, NotificationChain msgs) {
		IconStyleType oldIconStyle = iconStyle;
		iconStyle = newIconStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__ICON_STYLE, oldIconStyle, newIconStyle);
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
	public void setIconStyle(IconStyleType newIconStyle) {
		if (newIconStyle != iconStyle) {
			NotificationChain msgs = null;
			if (iconStyle != null)
				msgs = ((InternalEObject)iconStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__ICON_STYLE, null, msgs);
			if (newIconStyle != null)
				msgs = ((InternalEObject)newIconStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__ICON_STYLE, null, msgs);
			msgs = basicSetIconStyle(newIconStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__ICON_STYLE, newIconStyle, newIconStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyleType getLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(LabelStyleType newLabelStyle, NotificationChain msgs) {
		LabelStyleType oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LABEL_STYLE, oldLabelStyle, newLabelStyle);
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
	public void setLabelStyle(LabelStyleType newLabelStyle) {
		if (newLabelStyle != labelStyle) {
			NotificationChain msgs = null;
			if (labelStyle != null)
				msgs = ((InternalEObject)labelStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LABEL_STYLE, null, msgs);
			if (newLabelStyle != null)
				msgs = ((InternalEObject)newLabelStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LABEL_STYLE, null, msgs);
			msgs = basicSetLabelStyle(newLabelStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LABEL_STYLE, newLabelStyle, newLabelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyleType getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyleType newLineStyle, NotificationChain msgs) {
		LineStyleType oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LINE_STYLE, oldLineStyle, newLineStyle);
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
	public void setLineStyle(LineStyleType newLineStyle) {
		if (newLineStyle != lineStyle) {
			NotificationChain msgs = null;
			if (lineStyle != null)
				msgs = ((InternalEObject)lineStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LINE_STYLE, null, msgs);
			if (newLineStyle != null)
				msgs = ((InternalEObject)newLineStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LINE_STYLE, null, msgs);
			msgs = basicSetLineStyle(newLineStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LINE_STYLE, newLineStyle, newLineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyStyleType getPolyStyle() {
		return polyStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyStyle(PolyStyleType newPolyStyle, NotificationChain msgs) {
		PolyStyleType oldPolyStyle = polyStyle;
		polyStyle = newPolyStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__POLY_STYLE, oldPolyStyle, newPolyStyle);
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
	public void setPolyStyle(PolyStyleType newPolyStyle) {
		if (newPolyStyle != polyStyle) {
			NotificationChain msgs = null;
			if (polyStyle != null)
				msgs = ((InternalEObject)polyStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__POLY_STYLE, null, msgs);
			if (newPolyStyle != null)
				msgs = ((InternalEObject)newPolyStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__POLY_STYLE, null, msgs);
			msgs = basicSetPolyStyle(newPolyStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__POLY_STYLE, newPolyStyle, newPolyStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BalloonStyleType getBalloonStyle() {
		return balloonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalloonStyle(BalloonStyleType newBalloonStyle, NotificationChain msgs) {
		BalloonStyleType oldBalloonStyle = balloonStyle;
		balloonStyle = newBalloonStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__BALLOON_STYLE, oldBalloonStyle, newBalloonStyle);
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
	public void setBalloonStyle(BalloonStyleType newBalloonStyle) {
		if (newBalloonStyle != balloonStyle) {
			NotificationChain msgs = null;
			if (balloonStyle != null)
				msgs = ((InternalEObject)balloonStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__BALLOON_STYLE, null, msgs);
			if (newBalloonStyle != null)
				msgs = ((InternalEObject)newBalloonStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__BALLOON_STYLE, null, msgs);
			msgs = basicSetBalloonStyle(newBalloonStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__BALLOON_STYLE, newBalloonStyle, newBalloonStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStyleType getListStyle() {
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(ListStyleType newListStyle, NotificationChain msgs) {
		ListStyleType oldListStyle = listStyle;
		listStyle = newListStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LIST_STYLE, oldListStyle, newListStyle);
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
	public void setListStyle(ListStyleType newListStyle) {
		if (newListStyle != listStyle) {
			NotificationChain msgs = null;
			if (listStyle != null)
				msgs = ((InternalEObject)listStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LIST_STYLE, null, msgs);
			if (newListStyle != null)
				msgs = ((InternalEObject)newListStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.STYLE_TYPE__LIST_STYLE, null, msgs);
			msgs = basicSetListStyle(newListStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.STYLE_TYPE__LIST_STYLE, newListStyle, newListStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyleSimpleExtensionGroupGroup() {
		if (styleSimpleExtensionGroupGroup == null) {
			styleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return styleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getStyleSimpleExtensionGroup() {
		return getStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getStyleType_StyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyleObjectExtensionGroupGroup() {
		if (styleObjectExtensionGroupGroup == null) {
			styleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return styleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getStyleObjectExtensionGroup() {
		return getStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getStyleType_StyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.STYLE_TYPE__ICON_STYLE:
				return basicSetIconStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__LABEL_STYLE:
				return basicSetLabelStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__POLY_STYLE:
				return basicSetPolyStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__BALLOON_STYLE:
				return basicSetBalloonStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__LIST_STYLE:
				return basicSetListStyle(null, msgs);
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.STYLE_TYPE__ICON_STYLE:
				return getIconStyle();
			case KMLPackage.STYLE_TYPE__LABEL_STYLE:
				return getLabelStyle();
			case KMLPackage.STYLE_TYPE__LINE_STYLE:
				return getLineStyle();
			case KMLPackage.STYLE_TYPE__POLY_STYLE:
				return getPolyStyle();
			case KMLPackage.STYLE_TYPE__BALLOON_STYLE:
				return getBalloonStyle();
			case KMLPackage.STYLE_TYPE__LIST_STYLE:
				return getListStyle();
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP:
				return getStyleSimpleExtensionGroup();
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP:
				return getStyleObjectExtensionGroup();
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
			case KMLPackage.STYLE_TYPE__ICON_STYLE:
				setIconStyle((IconStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__LABEL_STYLE:
				setLabelStyle((LabelStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__LINE_STYLE:
				setLineStyle((LineStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__POLY_STYLE:
				setPolyStyle((PolyStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__LIST_STYLE:
				setListStyle((ListStyleType)newValue);
				return;
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.STYLE_TYPE__ICON_STYLE:
				setIconStyle((IconStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__LABEL_STYLE:
				setLabelStyle((LabelStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__LINE_STYLE:
				setLineStyle((LineStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__POLY_STYLE:
				setPolyStyle((PolyStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__LIST_STYLE:
				setListStyle((ListStyleType)null);
				return;
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.STYLE_TYPE__ICON_STYLE:
				return iconStyle != null;
			case KMLPackage.STYLE_TYPE__LABEL_STYLE:
				return labelStyle != null;
			case KMLPackage.STYLE_TYPE__LINE_STYLE:
				return lineStyle != null;
			case KMLPackage.STYLE_TYPE__POLY_STYLE:
				return polyStyle != null;
			case KMLPackage.STYLE_TYPE__BALLOON_STYLE:
				return balloonStyle != null;
			case KMLPackage.STYLE_TYPE__LIST_STYLE:
				return listStyle != null;
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return styleSimpleExtensionGroupGroup != null && !styleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP:
				return !getStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return styleObjectExtensionGroupGroup != null && !styleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP:
				return !getStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (styleSimpleExtensionGroupGroup: ");
		result.append(styleSimpleExtensionGroupGroup);
		result.append(", styleObjectExtensionGroupGroup: ");
		result.append(styleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //StyleTypeImpl
