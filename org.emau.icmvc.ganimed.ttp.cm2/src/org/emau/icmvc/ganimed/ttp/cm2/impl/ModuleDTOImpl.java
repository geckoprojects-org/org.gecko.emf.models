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

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getAssignedPolicies <em>Assigned Policies</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getShortText <em>Short Text</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleDTOImpl#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDTOImpl extends FhirIdDTOImpl implements ModuleDTO {
	/**
	 * The cached value of the '{@link #getAssignedPolicies() <em>Assigned Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignedPolicyDTO> assignedPolicies;

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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO key;

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
	 * The default value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected String shortText = SHORT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	protected ModuleDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getModuleDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssignedPolicyDTO> getAssignedPolicies() {
		if (assignedPolicies == null) {
			assignedPolicies = new EObjectContainmentEList<AssignedPolicyDTO>(AssignedPolicyDTO.class, this, Cm2Package.MODULE_DTO__ASSIGNED_POLICIES);
		}
		return assignedPolicies;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__FINALISED, oldFinalised, finalised, !oldFinalisedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.MODULE_DTO__FINALISED, oldFinalised, FINALISED_EDEFAULT, oldFinalisedESet));
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
	public ModuleKeyDTO getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(ModuleKeyDTO newKey, NotificationChain msgs) {
		ModuleKeyDTO oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__KEY, oldKey, newKey);
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
	public void setKey(ModuleKeyDTO newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.MODULE_DTO__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.MODULE_DTO__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__KEY, newKey, newKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortText() {
		return shortText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortText(String newShortText) {
		String oldShortText = shortText;
		shortText = newShortText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__SHORT_TEXT, oldShortText, shortText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_DTO__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.MODULE_DTO__ASSIGNED_POLICIES:
				return ((InternalEList<?>)getAssignedPolicies()).basicRemove(otherEnd, msgs);
			case Cm2Package.MODULE_DTO__KEY:
				return basicSetKey(null, msgs);
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
			case Cm2Package.MODULE_DTO__ASSIGNED_POLICIES:
				return getAssignedPolicies();
			case Cm2Package.MODULE_DTO__COMMENT:
				return getComment();
			case Cm2Package.MODULE_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.MODULE_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.MODULE_DTO__FINALISED:
				return isFinalised();
			case Cm2Package.MODULE_DTO__KEY:
				return getKey();
			case Cm2Package.MODULE_DTO__LABEL:
				return getLabel();
			case Cm2Package.MODULE_DTO__SHORT_TEXT:
				return getShortText();
			case Cm2Package.MODULE_DTO__TEXT:
				return getText();
			case Cm2Package.MODULE_DTO__TITLE:
				return getTitle();
			case Cm2Package.MODULE_DTO__UPDATE_DATE:
				return getUpdateDate();
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
			case Cm2Package.MODULE_DTO__ASSIGNED_POLICIES:
				getAssignedPolicies().clear();
				getAssignedPolicies().addAll((Collection<? extends AssignedPolicyDTO>)newValue);
				return;
			case Cm2Package.MODULE_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.MODULE_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__FINALISED:
				setFinalised((Boolean)newValue);
				return;
			case Cm2Package.MODULE_DTO__KEY:
				setKey((ModuleKeyDTO)newValue);
				return;
			case Cm2Package.MODULE_DTO__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__SHORT_TEXT:
				setShortText((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__TEXT:
				setText((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__TITLE:
				setTitle((String)newValue);
				return;
			case Cm2Package.MODULE_DTO__UPDATE_DATE:
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
			case Cm2Package.MODULE_DTO__ASSIGNED_POLICIES:
				getAssignedPolicies().clear();
				return;
			case Cm2Package.MODULE_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__FINALISED:
				unsetFinalised();
				return;
			case Cm2Package.MODULE_DTO__KEY:
				setKey((ModuleKeyDTO)null);
				return;
			case Cm2Package.MODULE_DTO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__SHORT_TEXT:
				setShortText(SHORT_TEXT_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Cm2Package.MODULE_DTO__UPDATE_DATE:
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
			case Cm2Package.MODULE_DTO__ASSIGNED_POLICIES:
				return assignedPolicies != null && !assignedPolicies.isEmpty();
			case Cm2Package.MODULE_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.MODULE_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.MODULE_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.MODULE_DTO__FINALISED:
				return isSetFinalised();
			case Cm2Package.MODULE_DTO__KEY:
				return key != null;
			case Cm2Package.MODULE_DTO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.MODULE_DTO__SHORT_TEXT:
				return SHORT_TEXT_EDEFAULT == null ? shortText != null : !SHORT_TEXT_EDEFAULT.equals(shortText);
			case Cm2Package.MODULE_DTO__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Cm2Package.MODULE_DTO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Cm2Package.MODULE_DTO__UPDATE_DATE:
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
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", finalised: ");
		if (finalisedESet) result.append(finalised); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", shortText: ");
		result.append(shortText);
		result.append(", text: ");
		result.append(text);
		result.append(", title: ");
		result.append(title);
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(')');
		return result.toString();
	}

} //ModuleDTOImpl
