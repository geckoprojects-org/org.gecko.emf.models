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
import de.online.adv.namespaces.adv.sk.xml.skadv.PostGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PreGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType5Impl#getPreGap <em>Pre Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType5Impl#getPostGap <em>Post Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType5Impl#getPreGraphic <em>Pre Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType5Impl#getPostGraphic <em>Post Graphic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StrokeType5Impl extends MinimalEObjectImpl.Container implements StrokeType5 {
	/**
	 * The default value of the '{@link #getPreGap() <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGap()
	 * @generated
	 * @ordered
	 */
	protected static final double PRE_GAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreGap() <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGap()
	 * @generated
	 * @ordered
	 */
	protected double preGap = PRE_GAP_EDEFAULT;

	/**
	 * This is true if the Pre Gap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preGapESet;

	/**
	 * The default value of the '{@link #getPostGap() <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostGap()
	 * @generated
	 * @ordered
	 */
	protected static final double POST_GAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPostGap() <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostGap()
	 * @generated
	 * @ordered
	 */
	protected double postGap = POST_GAP_EDEFAULT;

	/**
	 * This is true if the Post Gap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postGapESet;

	/**
	 * The cached value of the '{@link #getPreGraphic() <em>Pre Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGraphic()
	 * @generated
	 * @ordered
	 */
	protected PreGraphicType preGraphic;

	/**
	 * The cached value of the '{@link #getPostGraphic() <em>Post Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostGraphic()
	 * @generated
	 * @ordered
	 */
	protected PostGraphicType postGraphic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getStrokeType5();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPreGap() {
		return preGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreGap(double newPreGap) {
		double oldPreGap = preGap;
		preGap = newPreGap;
		boolean oldPreGapESet = preGapESet;
		preGapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__PRE_GAP, oldPreGap, preGap, !oldPreGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPreGap() {
		double oldPreGap = preGap;
		boolean oldPreGapESet = preGapESet;
		preGap = PRE_GAP_EDEFAULT;
		preGapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.STROKE_TYPE5__PRE_GAP, oldPreGap, PRE_GAP_EDEFAULT, oldPreGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPreGap() {
		return preGapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPostGap() {
		return postGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostGap(double newPostGap) {
		double oldPostGap = postGap;
		postGap = newPostGap;
		boolean oldPostGapESet = postGapESet;
		postGapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__POST_GAP, oldPostGap, postGap, !oldPostGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPostGap() {
		double oldPostGap = postGap;
		boolean oldPostGapESet = postGapESet;
		postGap = POST_GAP_EDEFAULT;
		postGapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.STROKE_TYPE5__POST_GAP, oldPostGap, POST_GAP_EDEFAULT, oldPostGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPostGap() {
		return postGapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreGraphicType getPreGraphic() {
		return preGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreGraphic(PreGraphicType newPreGraphic, NotificationChain msgs) {
		PreGraphicType oldPreGraphic = preGraphic;
		preGraphic = newPreGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__PRE_GRAPHIC, oldPreGraphic, newPreGraphic);
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
	public void setPreGraphic(PreGraphicType newPreGraphic) {
		if (newPreGraphic != preGraphic) {
			NotificationChain msgs = null;
			if (preGraphic != null)
				msgs = ((InternalEObject)preGraphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE5__PRE_GRAPHIC, null, msgs);
			if (newPreGraphic != null)
				msgs = ((InternalEObject)newPreGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE5__PRE_GRAPHIC, null, msgs);
			msgs = basicSetPreGraphic(newPreGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__PRE_GRAPHIC, newPreGraphic, newPreGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostGraphicType getPostGraphic() {
		return postGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostGraphic(PostGraphicType newPostGraphic, NotificationChain msgs) {
		PostGraphicType oldPostGraphic = postGraphic;
		postGraphic = newPostGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__POST_GRAPHIC, oldPostGraphic, newPostGraphic);
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
	public void setPostGraphic(PostGraphicType newPostGraphic) {
		if (newPostGraphic != postGraphic) {
			NotificationChain msgs = null;
			if (postGraphic != null)
				msgs = ((InternalEObject)postGraphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE5__POST_GRAPHIC, null, msgs);
			if (newPostGraphic != null)
				msgs = ((InternalEObject)newPostGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE5__POST_GRAPHIC, null, msgs);
			msgs = basicSetPostGraphic(newPostGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE5__POST_GRAPHIC, newPostGraphic, newPostGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.STROKE_TYPE5__PRE_GRAPHIC:
				return basicSetPreGraphic(null, msgs);
			case AAAPackage.STROKE_TYPE5__POST_GRAPHIC:
				return basicSetPostGraphic(null, msgs);
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
			case AAAPackage.STROKE_TYPE5__PRE_GAP:
				return getPreGap();
			case AAAPackage.STROKE_TYPE5__POST_GAP:
				return getPostGap();
			case AAAPackage.STROKE_TYPE5__PRE_GRAPHIC:
				return getPreGraphic();
			case AAAPackage.STROKE_TYPE5__POST_GRAPHIC:
				return getPostGraphic();
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
			case AAAPackage.STROKE_TYPE5__PRE_GAP:
				setPreGap((Double)newValue);
				return;
			case AAAPackage.STROKE_TYPE5__POST_GAP:
				setPostGap((Double)newValue);
				return;
			case AAAPackage.STROKE_TYPE5__PRE_GRAPHIC:
				setPreGraphic((PreGraphicType)newValue);
				return;
			case AAAPackage.STROKE_TYPE5__POST_GRAPHIC:
				setPostGraphic((PostGraphicType)newValue);
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
			case AAAPackage.STROKE_TYPE5__PRE_GAP:
				unsetPreGap();
				return;
			case AAAPackage.STROKE_TYPE5__POST_GAP:
				unsetPostGap();
				return;
			case AAAPackage.STROKE_TYPE5__PRE_GRAPHIC:
				setPreGraphic((PreGraphicType)null);
				return;
			case AAAPackage.STROKE_TYPE5__POST_GRAPHIC:
				setPostGraphic((PostGraphicType)null);
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
			case AAAPackage.STROKE_TYPE5__PRE_GAP:
				return isSetPreGap();
			case AAAPackage.STROKE_TYPE5__POST_GAP:
				return isSetPostGap();
			case AAAPackage.STROKE_TYPE5__PRE_GRAPHIC:
				return preGraphic != null;
			case AAAPackage.STROKE_TYPE5__POST_GRAPHIC:
				return postGraphic != null;
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
		result.append(" (preGap: ");
		if (preGapESet) result.append(preGap); else result.append("<unset>");
		result.append(", postGap: ");
		if (postGapESet) result.append(postGap); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StrokeType5Impl
