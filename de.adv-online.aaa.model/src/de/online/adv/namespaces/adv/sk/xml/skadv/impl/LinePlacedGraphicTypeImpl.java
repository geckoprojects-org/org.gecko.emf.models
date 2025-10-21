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
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Placed Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LinePlacedGraphicTypeImpl#getRelativeRotation <em>Relative Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LinePlacedGraphicTypeImpl#getGraphic <em>Graphic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinePlacedGraphicTypeImpl extends CompoundStrokeSectionTypeImpl implements LinePlacedGraphicType {
	/**
	 * The default value of the '{@link #getRelativeRotation() <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRotation()
	 * @generated
	 * @ordered
	 */
	protected static final RelativeRotationType RELATIVE_ROTATION_EDEFAULT = RelativeRotationType.NONE;

	/**
	 * The cached value of the '{@link #getRelativeRotation() <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRotation()
	 * @generated
	 * @ordered
	 */
	protected RelativeRotationType relativeRotation = RELATIVE_ROTATION_EDEFAULT;

	/**
	 * This is true if the Relative Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeRotationESet;

	/**
	 * The cached value of the '{@link #getGraphic() <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphic()
	 * @generated
	 * @ordered
	 */
	protected GraphicType2 graphic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinePlacedGraphicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLinePlacedGraphicType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeRotationType getRelativeRotation() {
		return relativeRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativeRotation(RelativeRotationType newRelativeRotation) {
		RelativeRotationType oldRelativeRotation = relativeRotation;
		relativeRotation = newRelativeRotation == null ? RELATIVE_ROTATION_EDEFAULT : newRelativeRotation;
		boolean oldRelativeRotationESet = relativeRotationESet;
		relativeRotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION, oldRelativeRotation, relativeRotation, !oldRelativeRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelativeRotation() {
		RelativeRotationType oldRelativeRotation = relativeRotation;
		boolean oldRelativeRotationESet = relativeRotationESet;
		relativeRotation = RELATIVE_ROTATION_EDEFAULT;
		relativeRotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION, oldRelativeRotation, RELATIVE_ROTATION_EDEFAULT, oldRelativeRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelativeRotation() {
		return relativeRotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType2 getGraphic() {
		return graphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic(GraphicType2 newGraphic, NotificationChain msgs) {
		GraphicType2 oldGraphic = graphic;
		graphic = newGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC, oldGraphic, newGraphic);
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
	public void setGraphic(GraphicType2 newGraphic) {
		if (newGraphic != graphic) {
			NotificationChain msgs = null;
			if (graphic != null)
				msgs = ((InternalEObject)graphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC, null, msgs);
			if (newGraphic != null)
				msgs = ((InternalEObject)newGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC, null, msgs);
			msgs = basicSetGraphic(newGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC, newGraphic, newGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC:
				return basicSetGraphic(null, msgs);
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
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION:
				return getRelativeRotation();
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC:
				return getGraphic();
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
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION:
				setRelativeRotation((RelativeRotationType)newValue);
				return;
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC:
				setGraphic((GraphicType2)newValue);
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
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION:
				unsetRelativeRotation();
				return;
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC:
				setGraphic((GraphicType2)null);
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
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__RELATIVE_ROTATION:
				return isSetRelativeRotation();
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE__GRAPHIC:
				return graphic != null;
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
		result.append(" (relativeRotation: ");
		if (relativeRotationESet) result.append(relativeRotation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LinePlacedGraphicTypeImpl
