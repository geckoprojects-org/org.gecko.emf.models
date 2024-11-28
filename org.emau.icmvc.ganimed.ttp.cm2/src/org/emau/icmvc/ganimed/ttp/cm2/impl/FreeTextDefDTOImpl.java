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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Text Def DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getConverterString <em>Converter String</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FreeTextDefDTOImpl#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreeTextDefDTOImpl extends FhirIdDTOImpl implements FreeTextDefDTO {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConverterString() <em>Converter String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConverterString() <em>Converter String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterString()
	 * @generated
	 * @ordered
	 */
	protected String converterString = CONVERTER_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected String externProperties = EXTERN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected boolean finalised = FINALISED_EDEFAULT;

	/**
	 * This is true if the Finalised attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalisedESet;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected int pos = POS_EDEFAULT;

	/**
	 * This is true if the Pos attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean posESet;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * This is true if the Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiredESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FreeTextType TYPE_EDEFAULT = FreeTextType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FreeTextType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updateDate = UPDATE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeTextDefDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getFreeTextDefDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConverterString() {
		return converterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConverterString(String newConverterString) {
		String oldConverterString = converterString;
		converterString = newConverterString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__CONVERTER_STRING, oldConverterString, converterString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternProperties() {
		return externProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternProperties(String newExternProperties) {
		String oldExternProperties = externProperties;
		externProperties = newExternProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFinalised() {
		return finalised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalised(boolean newFinalised) {
		boolean oldFinalised = finalised;
		finalised = newFinalised;
		boolean oldFinalisedESet = finalisedESet;
		finalisedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__FINALISED, oldFinalised, finalised, !oldFinalisedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFinalised() {
		boolean oldFinalised = finalised;
		boolean oldFinalisedESet = finalisedESet;
		finalised = FINALISED_EDEFAULT;
		finalisedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.FREE_TEXT_DEF_DTO__FINALISED, oldFinalised, FINALISED_EDEFAULT, oldFinalisedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFinalised() {
		return finalisedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPos(int newPos) {
		int oldPos = pos;
		pos = newPos;
		boolean oldPosESet = posESet;
		posESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__POS, oldPos, pos, !oldPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPos() {
		int oldPos = pos;
		boolean oldPosESet = posESet;
		pos = POS_EDEFAULT;
		posESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.FREE_TEXT_DEF_DTO__POS, oldPos, POS_EDEFAULT, oldPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPos() {
		return posESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		boolean oldRequiredESet = requiredESet;
		requiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED, oldRequired, required, !oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRequired() {
		boolean oldRequired = required;
		boolean oldRequiredESet = requiredESet;
		required = REQUIRED_EDEFAULT;
		requiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED, oldRequired, REQUIRED_EDEFAULT, oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRequired() {
		return requiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeTextType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(FreeTextType newType) {
		FreeTextType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		FreeTextType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.FREE_TEXT_DEF_DTO__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(XMLGregorianCalendar newUpdateDate) {
		XMLGregorianCalendar oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FREE_TEXT_DEF_DTO__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.FREE_TEXT_DEF_DTO__COMMENT:
				return getComment();
			case Cm2Package.FREE_TEXT_DEF_DTO__CONVERTER_STRING:
				return getConverterString();
			case Cm2Package.FREE_TEXT_DEF_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.FREE_TEXT_DEF_DTO__FINALISED:
				return isFinalised();
			case Cm2Package.FREE_TEXT_DEF_DTO__LABEL:
				return getLabel();
			case Cm2Package.FREE_TEXT_DEF_DTO__NAME:
				return getName();
			case Cm2Package.FREE_TEXT_DEF_DTO__POS:
				return getPos();
			case Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED:
				return isRequired();
			case Cm2Package.FREE_TEXT_DEF_DTO__TYPE:
				return getType();
			case Cm2Package.FREE_TEXT_DEF_DTO__UPDATE_DATE:
				return getUpdateDate();
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
			case Cm2Package.FREE_TEXT_DEF_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__CONVERTER_STRING:
				setConverterString((String)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__FINALISED:
				setFinalised((Boolean)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__NAME:
				setName((String)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__POS:
				setPos((Integer)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__TYPE:
				setType((FreeTextType)newValue);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__UPDATE_DATE:
				setUpdateDate((XMLGregorianCalendar)newValue);
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
			case Cm2Package.FREE_TEXT_DEF_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__CONVERTER_STRING:
				setConverterString(CONVERTER_STRING_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__FINALISED:
				unsetFinalised();
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__POS:
				unsetPos();
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED:
				unsetRequired();
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__TYPE:
				unsetType();
				return;
			case Cm2Package.FREE_TEXT_DEF_DTO__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
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
			case Cm2Package.FREE_TEXT_DEF_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.FREE_TEXT_DEF_DTO__CONVERTER_STRING:
				return CONVERTER_STRING_EDEFAULT == null ? converterString != null : !CONVERTER_STRING_EDEFAULT.equals(converterString);
			case Cm2Package.FREE_TEXT_DEF_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.FREE_TEXT_DEF_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.FREE_TEXT_DEF_DTO__FINALISED:
				return isSetFinalised();
			case Cm2Package.FREE_TEXT_DEF_DTO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.FREE_TEXT_DEF_DTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Cm2Package.FREE_TEXT_DEF_DTO__POS:
				return isSetPos();
			case Cm2Package.FREE_TEXT_DEF_DTO__REQUIRED:
				return isSetRequired();
			case Cm2Package.FREE_TEXT_DEF_DTO__TYPE:
				return isSetType();
			case Cm2Package.FREE_TEXT_DEF_DTO__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? updateDate != null : !UPDATE_DATE_EDEFAULT.equals(updateDate);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", converterString: ");
		result.append(converterString);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", finalised: ");
		if (finalisedESet) result.append(finalised); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", pos: ");
		if (posESet) result.append(pos); else result.append("<unset>");
		result.append(", required: ");
		if (requiredESet) result.append(required); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(')');
		return result.toString();
	}

} //FreeTextDefDTOImpl
