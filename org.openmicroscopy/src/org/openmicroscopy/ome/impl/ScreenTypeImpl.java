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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PlateRefType;
import org.openmicroscopy.ome.ReagentType;
import org.openmicroscopy.ome.ScreenType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getReagent <em>Reagent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getPlateRef <em>Plate Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getProtocolDescription <em>Protocol Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getProtocolIdentifier <em>Protocol Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getReagentSetDescription <em>Reagent Set Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getReagentSetIdentifier <em>Reagent Set Identifier</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ScreenTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenTypeImpl extends MinimalEObjectImpl.Container implements ScreenType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReagent() <em>Reagent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagent()
	 * @generated
	 * @ordered
	 */
	protected EList<ReagentType> reagent;

	/**
	 * The cached value of the '{@link #getPlateRef() <em>Plate Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PlateRefType> plateRef;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

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
	 * The default value of the '{@link #getProtocolDescription() <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolDescription() <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected String protocolDescription = PROTOCOL_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolIdentifier() <em>Protocol Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolIdentifier() <em>Protocol Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String protocolIdentifier = PROTOCOL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReagentSetDescription() <em>Reagent Set Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagentSetDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REAGENT_SET_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReagentSetDescription() <em>Reagent Set Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagentSetDescription()
	 * @generated
	 * @ordered
	 */
	protected String reagentSetDescription = REAGENT_SET_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReagentSetIdentifier() <em>Reagent Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagentSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REAGENT_SET_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReagentSetIdentifier() <em>Reagent Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReagentSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String reagentSetIdentifier = REAGENT_SET_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getScreenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReagentType> getReagent() {
		if (reagent == null) {
			reagent = new EObjectContainmentEList<ReagentType>(ReagentType.class, this, OMEPackage.SCREEN_TYPE__REAGENT);
		}
		return reagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlateRefType> getPlateRef() {
		if (plateRef == null) {
			plateRef = new EObjectContainmentEList<PlateRefType>(PlateRefType.class, this, OMEPackage.SCREEN_TYPE__PLATE_REF);
		}
		return plateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.SCREEN_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolDescription() {
		return protocolDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolDescription(String newProtocolDescription) {
		String oldProtocolDescription = protocolDescription;
		protocolDescription = newProtocolDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__PROTOCOL_DESCRIPTION, oldProtocolDescription, protocolDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolIdentifier() {
		return protocolIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolIdentifier(String newProtocolIdentifier) {
		String oldProtocolIdentifier = protocolIdentifier;
		protocolIdentifier = newProtocolIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__PROTOCOL_IDENTIFIER, oldProtocolIdentifier, protocolIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReagentSetDescription() {
		return reagentSetDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReagentSetDescription(String newReagentSetDescription) {
		String oldReagentSetDescription = reagentSetDescription;
		reagentSetDescription = newReagentSetDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__REAGENT_SET_DESCRIPTION, oldReagentSetDescription, reagentSetDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReagentSetIdentifier() {
		return reagentSetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReagentSetIdentifier(String newReagentSetIdentifier) {
		String oldReagentSetIdentifier = reagentSetIdentifier;
		reagentSetIdentifier = newReagentSetIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__REAGENT_SET_IDENTIFIER, oldReagentSetIdentifier, reagentSetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.SCREEN_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.SCREEN_TYPE__REAGENT:
				return ((InternalEList<?>)getReagent()).basicRemove(otherEnd, msgs);
			case OMEPackage.SCREEN_TYPE__PLATE_REF:
				return ((InternalEList<?>)getPlateRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.SCREEN_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.SCREEN_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.SCREEN_TYPE__REAGENT:
				return getReagent();
			case OMEPackage.SCREEN_TYPE__PLATE_REF:
				return getPlateRef();
			case OMEPackage.SCREEN_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.SCREEN_TYPE__ID:
				return getID();
			case OMEPackage.SCREEN_TYPE__NAME:
				return getName();
			case OMEPackage.SCREEN_TYPE__PROTOCOL_DESCRIPTION:
				return getProtocolDescription();
			case OMEPackage.SCREEN_TYPE__PROTOCOL_IDENTIFIER:
				return getProtocolIdentifier();
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_DESCRIPTION:
				return getReagentSetDescription();
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_IDENTIFIER:
				return getReagentSetIdentifier();
			case OMEPackage.SCREEN_TYPE__TYPE:
				return getType();
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
			case OMEPackage.SCREEN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT:
				getReagent().clear();
				getReagent().addAll((Collection<? extends ReagentType>)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__PLATE_REF:
				getPlateRef().clear();
				getPlateRef().addAll((Collection<? extends PlateRefType>)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__NAME:
				setName((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__PROTOCOL_DESCRIPTION:
				setProtocolDescription((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__PROTOCOL_IDENTIFIER:
				setProtocolIdentifier((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_DESCRIPTION:
				setReagentSetDescription((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_IDENTIFIER:
				setReagentSetIdentifier((String)newValue);
				return;
			case OMEPackage.SCREEN_TYPE__TYPE:
				setType((String)newValue);
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
			case OMEPackage.SCREEN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT:
				getReagent().clear();
				return;
			case OMEPackage.SCREEN_TYPE__PLATE_REF:
				getPlateRef().clear();
				return;
			case OMEPackage.SCREEN_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.SCREEN_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__PROTOCOL_DESCRIPTION:
				setProtocolDescription(PROTOCOL_DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__PROTOCOL_IDENTIFIER:
				setProtocolIdentifier(PROTOCOL_IDENTIFIER_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_DESCRIPTION:
				setReagentSetDescription(REAGENT_SET_DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_IDENTIFIER:
				setReagentSetIdentifier(REAGENT_SET_IDENTIFIER_EDEFAULT);
				return;
			case OMEPackage.SCREEN_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OMEPackage.SCREEN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.SCREEN_TYPE__REAGENT:
				return reagent != null && !reagent.isEmpty();
			case OMEPackage.SCREEN_TYPE__PLATE_REF:
				return plateRef != null && !plateRef.isEmpty();
			case OMEPackage.SCREEN_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.SCREEN_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.SCREEN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMEPackage.SCREEN_TYPE__PROTOCOL_DESCRIPTION:
				return PROTOCOL_DESCRIPTION_EDEFAULT == null ? protocolDescription != null : !PROTOCOL_DESCRIPTION_EDEFAULT.equals(protocolDescription);
			case OMEPackage.SCREEN_TYPE__PROTOCOL_IDENTIFIER:
				return PROTOCOL_IDENTIFIER_EDEFAULT == null ? protocolIdentifier != null : !PROTOCOL_IDENTIFIER_EDEFAULT.equals(protocolIdentifier);
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_DESCRIPTION:
				return REAGENT_SET_DESCRIPTION_EDEFAULT == null ? reagentSetDescription != null : !REAGENT_SET_DESCRIPTION_EDEFAULT.equals(reagentSetDescription);
			case OMEPackage.SCREEN_TYPE__REAGENT_SET_IDENTIFIER:
				return REAGENT_SET_IDENTIFIER_EDEFAULT == null ? reagentSetIdentifier != null : !REAGENT_SET_IDENTIFIER_EDEFAULT.equals(reagentSetIdentifier);
			case OMEPackage.SCREEN_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", protocolDescription: ");
		result.append(protocolDescription);
		result.append(", protocolIdentifier: ");
		result.append(protocolIdentifier);
		result.append(", reagentSetDescription: ");
		result.append(reagentSetDescription);
		result.append(", reagentSetIdentifier: ");
		result.append(reagentSetIdentifier);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ScreenTypeImpl
