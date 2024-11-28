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

import org.emau.icmvc.ganimed.ttp.cm2.AssignedModuleDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateStructureDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextDefDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Template DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getAssignedModules <em>Assigned Modules</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getFreeTextDefs <em>Free Text Defs</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getMappedConsentTemplates <em>Mapped Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getMappedObjectionTemplates <em>Mapped Objection Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getMappedOptOutConsentTemplates <em>Mapped Opt Out Consent Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getMappedRefusalTemplates <em>Mapped Refusal Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getMappedRevocationTemplates <em>Mapped Revocation Templates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getScanBase64 <em>Scan Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getScanFileType <em>Scan File Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getValidFromProperties <em>Valid From Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentTemplateDTOImpl#getVersionLabel <em>Version Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentTemplateDTOImpl extends FhirIdDTOImpl implements ConsentTemplateDTO {
	/**
	 * The cached value of the '{@link #getAssignedModules() <em>Assigned Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignedModuleDTO> assignedModules;

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
	 * The cached value of the '{@link #getExpirationProperties() <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationProperties()
	 * @generated
	 * @ordered
	 */
	protected ExpirationPropertiesDTO expirationProperties;

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
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFreeTextDefs() <em>Free Text Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeTextDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<FreeTextDefDTO> freeTextDefs;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateKeyDTO key;

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
	 * The cached value of the '{@link #getMappedConsentTemplates() <em>Mapped Consent Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedConsentTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateKeyDTO> mappedConsentTemplates;

	/**
	 * The cached value of the '{@link #getMappedObjectionTemplates() <em>Mapped Objection Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedObjectionTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateKeyDTO> mappedObjectionTemplates;

	/**
	 * The cached value of the '{@link #getMappedOptOutConsentTemplates() <em>Mapped Opt Out Consent Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedOptOutConsentTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateKeyDTO> mappedOptOutConsentTemplates;

	/**
	 * The cached value of the '{@link #getMappedRefusalTemplates() <em>Mapped Refusal Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRefusalTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateKeyDTO> mappedRefusalTemplates;

	/**
	 * The cached value of the '{@link #getMappedRevocationTemplates() <em>Mapped Revocation Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRevocationTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateKeyDTO> mappedRevocationTemplates;

	/**
	 * The default value of the '{@link #getScanBase64() <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanBase64()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAN_BASE64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanBase64() <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanBase64()
	 * @generated
	 * @ordered
	 */
	protected String scanBase64 = SCAN_BASE64_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanFileType() <em>Scan File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanFileType()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAN_FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanFileType() <em>Scan File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanFileType()
	 * @generated
	 * @ordered
	 */
	protected String scanFileType = SCAN_FILE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateStructureDTO structure;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentTemplateType TYPE_EDEFAULT = ConsentTemplateType.CONSENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getValidFromProperties() <em>Valid From Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromProperties()
	 * @generated
	 * @ordered
	 */
	protected ValidFromPropertiesDTO validFromProperties;

	/**
	 * The default value of the '{@link #getVersionLabel() <em>Version Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionLabel() <em>Version Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLabel()
	 * @generated
	 * @ordered
	 */
	protected String versionLabel = VERSION_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentTemplateDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentTemplateDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssignedModuleDTO> getAssignedModules() {
		if (assignedModules == null) {
			assignedModules = new EObjectContainmentEList<AssignedModuleDTO>(AssignedModuleDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES);
		}
		return assignedModules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO getExpirationProperties() {
		return expirationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationProperties(ExpirationPropertiesDTO newExpirationProperties, NotificationChain msgs) {
		ExpirationPropertiesDTO oldExpirationProperties = expirationProperties;
		expirationProperties = newExpirationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
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
	public void setExpirationProperties(ExpirationPropertiesDTO newExpirationProperties) {
		if (newExpirationProperties != expirationProperties) {
			NotificationChain msgs = null;
			if (expirationProperties != null)
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED, oldFinalised, finalised, !oldFinalisedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED, oldFinalised, FINALISED_EDEFAULT, oldFinalisedESet));
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
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FreeTextDefDTO> getFreeTextDefs() {
		if (freeTextDefs == null) {
			freeTextDefs = new EObjectContainmentEList<FreeTextDefDTO>(FreeTextDefDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS);
		}
		return freeTextDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateKeyDTO getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(ConsentTemplateKeyDTO newKey, NotificationChain msgs) {
		ConsentTemplateKeyDTO oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__KEY, oldKey, newKey);
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
	public void setKey(ConsentTemplateKeyDTO newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__KEY, newKey, newKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateKeyDTO> getMappedConsentTemplates() {
		if (mappedConsentTemplates == null) {
			mappedConsentTemplates = new EObjectContainmentEList<ConsentTemplateKeyDTO>(ConsentTemplateKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES);
		}
		return mappedConsentTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateKeyDTO> getMappedObjectionTemplates() {
		if (mappedObjectionTemplates == null) {
			mappedObjectionTemplates = new EObjectContainmentEList<ConsentTemplateKeyDTO>(ConsentTemplateKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES);
		}
		return mappedObjectionTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateKeyDTO> getMappedOptOutConsentTemplates() {
		if (mappedOptOutConsentTemplates == null) {
			mappedOptOutConsentTemplates = new EObjectContainmentEList<ConsentTemplateKeyDTO>(ConsentTemplateKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES);
		}
		return mappedOptOutConsentTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateKeyDTO> getMappedRefusalTemplates() {
		if (mappedRefusalTemplates == null) {
			mappedRefusalTemplates = new EObjectContainmentEList<ConsentTemplateKeyDTO>(ConsentTemplateKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES);
		}
		return mappedRefusalTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateKeyDTO> getMappedRevocationTemplates() {
		if (mappedRevocationTemplates == null) {
			mappedRevocationTemplates = new EObjectContainmentEList<ConsentTemplateKeyDTO>(ConsentTemplateKeyDTO.class, this, Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES);
		}
		return mappedRevocationTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScanBase64() {
		return scanBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanBase64(String newScanBase64) {
		String oldScanBase64 = scanBase64;
		scanBase64 = newScanBase64;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_BASE64, oldScanBase64, scanBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScanFileType() {
		return scanFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanFileType(String newScanFileType) {
		String oldScanFileType = scanFileType;
		scanFileType = newScanFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE, oldScanFileType, scanFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateStructureDTO getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(ConsentTemplateStructureDTO newStructure, NotificationChain msgs) {
		ConsentTemplateStructureDTO oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(ConsentTemplateStructureDTO newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE, newStructure, newStructure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ConsentTemplateType newType) {
		ConsentTemplateType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		ConsentTemplateType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.CONSENT_TEMPLATE_DTO__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidFromPropertiesDTO getValidFromProperties() {
		return validFromProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidFromProperties(ValidFromPropertiesDTO newValidFromProperties, NotificationChain msgs) {
		ValidFromPropertiesDTO oldValidFromProperties = validFromProperties;
		validFromProperties = newValidFromProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES, oldValidFromProperties, newValidFromProperties);
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
	public void setValidFromProperties(ValidFromPropertiesDTO newValidFromProperties) {
		if (newValidFromProperties != validFromProperties) {
			NotificationChain msgs = null;
			if (validFromProperties != null)
				msgs = ((InternalEObject)validFromProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES, null, msgs);
			if (newValidFromProperties != null)
				msgs = ((InternalEObject)newValidFromProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES, null, msgs);
			msgs = basicSetValidFromProperties(newValidFromProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES, newValidFromProperties, newValidFromProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionLabel() {
		return versionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionLabel(String newVersionLabel) {
		String oldVersionLabel = versionLabel;
		versionLabel = newVersionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_TEMPLATE_DTO__VERSION_LABEL, oldVersionLabel, versionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES:
				return ((InternalEList<?>)getAssignedModules()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS:
				return ((InternalEList<?>)getFreeTextDefs()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__KEY:
				return basicSetKey(null, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES:
				return ((InternalEList<?>)getMappedConsentTemplates()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES:
				return ((InternalEList<?>)getMappedObjectionTemplates()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES:
				return ((InternalEList<?>)getMappedOptOutConsentTemplates()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES:
				return ((InternalEList<?>)getMappedRefusalTemplates()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES:
				return ((InternalEList<?>)getMappedRevocationTemplates()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE:
				return basicSetStructure(null, msgs);
			case Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES:
				return basicSetValidFromProperties(null, msgs);
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
			case Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES:
				return getAssignedModules();
			case Cm2Package.CONSENT_TEMPLATE_DTO__COMMENT:
				return getComment();
			case Cm2Package.CONSENT_TEMPLATE_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED:
				return isFinalised();
			case Cm2Package.CONSENT_TEMPLATE_DTO__FOOTER:
				return getFooter();
			case Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS:
				return getFreeTextDefs();
			case Cm2Package.CONSENT_TEMPLATE_DTO__HEADER:
				return getHeader();
			case Cm2Package.CONSENT_TEMPLATE_DTO__KEY:
				return getKey();
			case Cm2Package.CONSENT_TEMPLATE_DTO__LABEL:
				return getLabel();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES:
				return getMappedConsentTemplates();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES:
				return getMappedObjectionTemplates();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES:
				return getMappedOptOutConsentTemplates();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES:
				return getMappedRefusalTemplates();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES:
				return getMappedRevocationTemplates();
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_BASE64:
				return getScanBase64();
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE:
				return getScanFileType();
			case Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE:
				return getStructure();
			case Cm2Package.CONSENT_TEMPLATE_DTO__TITLE:
				return getTitle();
			case Cm2Package.CONSENT_TEMPLATE_DTO__TYPE:
				return getType();
			case Cm2Package.CONSENT_TEMPLATE_DTO__UPDATE_DATE:
				return getUpdateDate();
			case Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES:
				return getValidFromProperties();
			case Cm2Package.CONSENT_TEMPLATE_DTO__VERSION_LABEL:
				return getVersionLabel();
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
			case Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES:
				getAssignedModules().clear();
				getAssignedModules().addAll((Collection<? extends AssignedModuleDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED:
				setFinalised((Boolean)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FOOTER:
				setFooter((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS:
				getFreeTextDefs().clear();
				getFreeTextDefs().addAll((Collection<? extends FreeTextDefDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__HEADER:
				setHeader((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__KEY:
				setKey((ConsentTemplateKeyDTO)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES:
				getMappedConsentTemplates().clear();
				getMappedConsentTemplates().addAll((Collection<? extends ConsentTemplateKeyDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES:
				getMappedObjectionTemplates().clear();
				getMappedObjectionTemplates().addAll((Collection<? extends ConsentTemplateKeyDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES:
				getMappedOptOutConsentTemplates().clear();
				getMappedOptOutConsentTemplates().addAll((Collection<? extends ConsentTemplateKeyDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES:
				getMappedRefusalTemplates().clear();
				getMappedRefusalTemplates().addAll((Collection<? extends ConsentTemplateKeyDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES:
				getMappedRevocationTemplates().clear();
				getMappedRevocationTemplates().addAll((Collection<? extends ConsentTemplateKeyDTO>)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_BASE64:
				setScanBase64((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE:
				setScanFileType((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE:
				setStructure((ConsentTemplateStructureDTO)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__TITLE:
				setTitle((String)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__TYPE:
				setType((ConsentTemplateType)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__UPDATE_DATE:
				setUpdateDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES:
				setValidFromProperties((ValidFromPropertiesDTO)newValue);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__VERSION_LABEL:
				setVersionLabel((String)newValue);
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
			case Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES:
				getAssignedModules().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED:
				unsetFinalised();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS:
				getFreeTextDefs().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__KEY:
				setKey((ConsentTemplateKeyDTO)null);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES:
				getMappedConsentTemplates().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES:
				getMappedObjectionTemplates().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES:
				getMappedOptOutConsentTemplates().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES:
				getMappedRefusalTemplates().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES:
				getMappedRevocationTemplates().clear();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_BASE64:
				setScanBase64(SCAN_BASE64_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE:
				setScanFileType(SCAN_FILE_TYPE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE:
				setStructure((ConsentTemplateStructureDTO)null);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__TYPE:
				unsetType();
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES:
				setValidFromProperties((ValidFromPropertiesDTO)null);
				return;
			case Cm2Package.CONSENT_TEMPLATE_DTO__VERSION_LABEL:
				setVersionLabel(VERSION_LABEL_EDEFAULT);
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
			case Cm2Package.CONSENT_TEMPLATE_DTO__ASSIGNED_MODULES:
				return assignedModules != null && !assignedModules.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.CONSENT_TEMPLATE_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.CONSENT_TEMPLATE_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.CONSENT_TEMPLATE_DTO__FINALISED:
				return isSetFinalised();
			case Cm2Package.CONSENT_TEMPLATE_DTO__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case Cm2Package.CONSENT_TEMPLATE_DTO__FREE_TEXT_DEFS:
				return freeTextDefs != null && !freeTextDefs.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case Cm2Package.CONSENT_TEMPLATE_DTO__KEY:
				return key != null;
			case Cm2Package.CONSENT_TEMPLATE_DTO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_CONSENT_TEMPLATES:
				return mappedConsentTemplates != null && !mappedConsentTemplates.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OBJECTION_TEMPLATES:
				return mappedObjectionTemplates != null && !mappedObjectionTemplates.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_OPT_OUT_CONSENT_TEMPLATES:
				return mappedOptOutConsentTemplates != null && !mappedOptOutConsentTemplates.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REFUSAL_TEMPLATES:
				return mappedRefusalTemplates != null && !mappedRefusalTemplates.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__MAPPED_REVOCATION_TEMPLATES:
				return mappedRevocationTemplates != null && !mappedRevocationTemplates.isEmpty();
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_BASE64:
				return SCAN_BASE64_EDEFAULT == null ? scanBase64 != null : !SCAN_BASE64_EDEFAULT.equals(scanBase64);
			case Cm2Package.CONSENT_TEMPLATE_DTO__SCAN_FILE_TYPE:
				return SCAN_FILE_TYPE_EDEFAULT == null ? scanFileType != null : !SCAN_FILE_TYPE_EDEFAULT.equals(scanFileType);
			case Cm2Package.CONSENT_TEMPLATE_DTO__STRUCTURE:
				return structure != null;
			case Cm2Package.CONSENT_TEMPLATE_DTO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Cm2Package.CONSENT_TEMPLATE_DTO__TYPE:
				return isSetType();
			case Cm2Package.CONSENT_TEMPLATE_DTO__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? updateDate != null : !UPDATE_DATE_EDEFAULT.equals(updateDate);
			case Cm2Package.CONSENT_TEMPLATE_DTO__VALID_FROM_PROPERTIES:
				return validFromProperties != null;
			case Cm2Package.CONSENT_TEMPLATE_DTO__VERSION_LABEL:
				return VERSION_LABEL_EDEFAULT == null ? versionLabel != null : !VERSION_LABEL_EDEFAULT.equals(versionLabel);
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
		result.append(", footer: ");
		result.append(footer);
		result.append(", header: ");
		result.append(header);
		result.append(", label: ");
		result.append(label);
		result.append(", scanBase64: ");
		result.append(scanBase64);
		result.append(", scanFileType: ");
		result.append(scanFileType);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(", versionLabel: ");
		result.append(versionLabel);
		result.append(')');
		return result.toString();
	}

} //ConsentTemplateDTOImpl
