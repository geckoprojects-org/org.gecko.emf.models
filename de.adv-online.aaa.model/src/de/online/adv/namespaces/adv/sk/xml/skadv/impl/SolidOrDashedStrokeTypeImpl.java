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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.ColorType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineJoinType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solid Or Dashed Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getLinecaps <em>Linecaps</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getLinejoin <em>Linejoin</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getMiterlimit <em>Miterlimit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SolidOrDashedStrokeTypeImpl#getBoundary <em>Boundary</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SolidOrDashedStrokeTypeImpl extends StrokeType5Impl implements SolidOrDashedStrokeType {
	/**
	 * The default value of the '{@link #getLinecaps() <em>Linecaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinecaps()
	 * @generated
	 * @ordered
	 */
	protected static final LineCapsType LINECAPS_EDEFAULT = LineCapsType.BUTT;

	/**
	 * The cached value of the '{@link #getLinecaps() <em>Linecaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinecaps()
	 * @generated
	 * @ordered
	 */
	protected LineCapsType linecaps = LINECAPS_EDEFAULT;

	/**
	 * This is true if the Linecaps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linecapsESet;

	/**
	 * The default value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final LineJoinType LINEJOIN_EDEFAULT = LineJoinType.BEVEL;

	/**
	 * The cached value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected LineJoinType linejoin = LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linejoinESet;

	/**
	 * The default value of the '{@link #getMiterlimit() <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final double MITERLIMIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMiterlimit() <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected double miterlimit = MITERLIMIT_EDEFAULT;

	/**
	 * This is true if the Miterlimit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean miterlimitESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected EList<ColorType1> color;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected BoundaryType1 boundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolidOrDashedStrokeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getSolidOrDashedStrokeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineCapsType getLinecaps() {
		return linecaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinecaps(LineCapsType newLinecaps) {
		LineCapsType oldLinecaps = linecaps;
		linecaps = newLinecaps == null ? LINECAPS_EDEFAULT : newLinecaps;
		boolean oldLinecapsESet = linecapsESet;
		linecapsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS, oldLinecaps, linecaps, !oldLinecapsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinecaps() {
		LineCapsType oldLinecaps = linecaps;
		boolean oldLinecapsESet = linecapsESet;
		linecaps = LINECAPS_EDEFAULT;
		linecapsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS, oldLinecaps, LINECAPS_EDEFAULT, oldLinecapsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinecaps() {
		return linecapsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineJoinType getLinejoin() {
		return linejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinejoin(LineJoinType newLinejoin) {
		LineJoinType oldLinejoin = linejoin;
		linejoin = newLinejoin == null ? LINEJOIN_EDEFAULT : newLinejoin;
		boolean oldLinejoinESet = linejoinESet;
		linejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN, oldLinejoin, linejoin, !oldLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinejoin() {
		LineJoinType oldLinejoin = linejoin;
		boolean oldLinejoinESet = linejoinESet;
		linejoin = LINEJOIN_EDEFAULT;
		linejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN, oldLinejoin, LINEJOIN_EDEFAULT, oldLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinejoin() {
		return linejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMiterlimit() {
		return miterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiterlimit(double newMiterlimit) {
		double oldMiterlimit = miterlimit;
		miterlimit = newMiterlimit;
		boolean oldMiterlimitESet = miterlimitESet;
		miterlimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT, oldMiterlimit, miterlimit, !oldMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMiterlimit() {
		double oldMiterlimit = miterlimit;
		boolean oldMiterlimitESet = miterlimitESet;
		miterlimit = MITERLIMIT_EDEFAULT;
		miterlimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT, oldMiterlimit, MITERLIMIT_EDEFAULT, oldMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMiterlimit() {
		return miterlimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWidth() {
		double oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColorType1> getColor() {
		if (color == null) {
			color = new EObjectContainmentEList<ColorType1>(ColorType1.class, this, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR);
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType1 getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundary(BoundaryType1 newBoundary, NotificationChain msgs) {
		BoundaryType1 oldBoundary = boundary;
		boundary = newBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY, oldBoundary, newBoundary);
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
	public void setBoundary(BoundaryType1 newBoundary) {
		if (newBoundary != boundary) {
			NotificationChain msgs = null;
			if (boundary != null)
				msgs = ((InternalEObject)boundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY, null, msgs);
			if (newBoundary != null)
				msgs = ((InternalEObject)newBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY, null, msgs);
			msgs = basicSetBoundary(newBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY, newBoundary, newBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR:
				return ((InternalEList<?>)getColor()).basicRemove(otherEnd, msgs);
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY:
				return basicSetBoundary(null, msgs);
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
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS:
				return getLinecaps();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN:
				return getLinejoin();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT:
				return getMiterlimit();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH:
				return getWidth();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR:
				return getColor();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY:
				return getBoundary();
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
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS:
				setLinecaps((LineCapsType)newValue);
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN:
				setLinejoin((LineJoinType)newValue);
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT:
				setMiterlimit((Double)newValue);
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH:
				setWidth((Double)newValue);
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR:
				getColor().clear();
				getColor().addAll((Collection<? extends ColorType1>)newValue);
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY:
				setBoundary((BoundaryType1)newValue);
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
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS:
				unsetLinecaps();
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN:
				unsetLinejoin();
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT:
				unsetMiterlimit();
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH:
				unsetWidth();
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR:
				getColor().clear();
				return;
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY:
				setBoundary((BoundaryType1)null);
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
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINECAPS:
				return isSetLinecaps();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__LINEJOIN:
				return isSetLinejoin();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__MITERLIMIT:
				return isSetMiterlimit();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__WIDTH:
				return isSetWidth();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__COLOR:
				return color != null && !color.isEmpty();
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE__BOUNDARY:
				return boundary != null;
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
		result.append(" (linecaps: ");
		if (linecapsESet) result.append(linecaps); else result.append("<unset>");
		result.append(", linejoin: ");
		if (linejoinESet) result.append(linejoin); else result.append("<unset>");
		result.append(", miterlimit: ");
		if (miterlimitESet) result.append(miterlimit); else result.append("<unset>");
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SolidOrDashedStrokeTypeImpl
