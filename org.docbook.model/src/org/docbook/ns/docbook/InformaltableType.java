/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informaltable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getInfo <em>Info</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTextobject <em>Textobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getMediaobject <em>Mediaobject</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTgroup <em>Tgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getCol <em>Col</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getThead <em>Thead</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTr <em>Tr</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getBorder <em>Border</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getColsep <em>Colsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getFloatstyle <em>Floatstyle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOrient <em>Orient</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getPgwide <em>Pgwide</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRowheader <em>Rowheader</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRowsep <em>Rowsep</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getRules <em>Rules</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTabstyle <em>Tabstyle</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.InformaltableType#getXreflabel <em>Xreflabel</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType()
 * @model extendedMetaData="name='informaltable_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InformaltableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(InfoType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

	/**
	 * Returns the value of the '<em><b>Textobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TextobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Textobject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textobject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextobjectType> getTextobject();

	/**
	 * Returns the value of the '<em><b>Mediaobject</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.MediaobjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediaobject</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Mediaobject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mediaobject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MediaobjectType> getMediaobject();

	/**
	 * Returns the value of the '<em><b>Tgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgroup</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Tgroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TgroupType> getTgroup();

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ColType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColType> getCol();

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.ColgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Colgroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColgroupType> getColgroup();

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Thead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(TfootType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Tfoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	TfootType getTfoot();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(TfootType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TbodyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Tbody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TbodyType> getTbody();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.TrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Tr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrType> getTr();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Object value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(Object value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Border()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='border'"
	 * @generated
	 */
	String getBorder();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(String value);

	/**
	 * Returns the value of the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellpadding</em>' attribute.
	 * @see #setCellpadding(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Cellpadding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='cellpadding'"
	 * @generated
	 */
	Object getCellpadding();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getCellpadding <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellpadding</em>' attribute.
	 * @see #getCellpadding()
	 * @generated
	 */
	void setCellpadding(Object value);

	/**
	 * Returns the value of the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellspacing</em>' attribute.
	 * @see #setCellspacing(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Cellspacing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='cellspacing'"
	 * @generated
	 */
	Object getCellspacing();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getCellspacing <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellspacing</em>' attribute.
	 * @see #getCellspacing()
	 * @generated
	 */
	void setCellspacing(Object value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	Object getClass_();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Object value);

	/**
	 * Returns the value of the '<em><b>Colsep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ColsepType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colsep</em>' attribute.
	 * @see org.docbook.ns.docbook.ColsepType4
	 * @see #isSetColsep()
	 * @see #unsetColsep()
	 * @see #setColsep(ColsepType4)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Colsep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='colsep'"
	 * @generated
	 */
	ColsepType4 getColsep();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getColsep <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colsep</em>' attribute.
	 * @see org.docbook.ns.docbook.ColsepType4
	 * @see #isSetColsep()
	 * @see #unsetColsep()
	 * @see #getColsep()
	 * @generated
	 */
	void setColsep(ColsepType4 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getColsep <em>Colsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColsep()
	 * @see #getColsep()
	 * @see #setColsep(ColsepType4)
	 * @generated
	 */
	void unsetColsep();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getColsep <em>Colsep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colsep</em>' attribute is set.
	 * @see #unsetColsep()
	 * @see #getColsep()
	 * @see #setColsep(ColsepType4)
	 * @generated
	 */
	boolean isSetColsep();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Object value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see #setConformance(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Object value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Floatstyle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatstyle</em>' attribute.
	 * @see #setFloatstyle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Floatstyle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='floatstyle'"
	 * @generated
	 */
	Object getFloatstyle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getFloatstyle <em>Floatstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floatstyle</em>' attribute.
	 * @see #getFloatstyle()
	 * @generated
	 */
	void setFloatstyle(Object value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.FrameType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see org.docbook.ns.docbook.FrameType1
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(FrameType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Frame()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	FrameType1 getFrame();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see org.docbook.ns.docbook.FrameType1
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType1 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType1)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType1)
	 * @generated
	 */
	boolean isSetFrame();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	Object getLang1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(Object value);

	/**
	 * Returns the value of the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkend</em>' attribute.
	 * @see #setLinkend(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onclick</em>' attribute.
	 * @see #setOnclick(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onclick()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onclick'"
	 * @generated
	 */
	Object getOnclick();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnclick <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onclick</em>' attribute.
	 * @see #getOnclick()
	 * @generated
	 */
	void setOnclick(Object value);

	/**
	 * Returns the value of the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ondblclick</em>' attribute.
	 * @see #setOndblclick(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Ondblclick()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='ondblclick'"
	 * @generated
	 */
	Object getOndblclick();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOndblclick <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ondblclick</em>' attribute.
	 * @see #getOndblclick()
	 * @generated
	 */
	void setOndblclick(Object value);

	/**
	 * Returns the value of the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeydown</em>' attribute.
	 * @see #setOnkeydown(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onkeydown()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onkeydown'"
	 * @generated
	 */
	Object getOnkeydown();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnkeydown <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeydown</em>' attribute.
	 * @see #getOnkeydown()
	 * @generated
	 */
	void setOnkeydown(Object value);

	/**
	 * Returns the value of the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeypress</em>' attribute.
	 * @see #setOnkeypress(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onkeypress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onkeypress'"
	 * @generated
	 */
	Object getOnkeypress();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnkeypress <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeypress</em>' attribute.
	 * @see #getOnkeypress()
	 * @generated
	 */
	void setOnkeypress(Object value);

	/**
	 * Returns the value of the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeyup</em>' attribute.
	 * @see #setOnkeyup(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onkeyup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onkeyup'"
	 * @generated
	 */
	Object getOnkeyup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnkeyup <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeyup</em>' attribute.
	 * @see #getOnkeyup()
	 * @generated
	 */
	void setOnkeyup(Object value);

	/**
	 * Returns the value of the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousedown</em>' attribute.
	 * @see #setOnmousedown(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onmousedown()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onmousedown'"
	 * @generated
	 */
	Object getOnmousedown();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnmousedown <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousedown</em>' attribute.
	 * @see #getOnmousedown()
	 * @generated
	 */
	void setOnmousedown(Object value);

	/**
	 * Returns the value of the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousemove</em>' attribute.
	 * @see #setOnmousemove(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onmousemove()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onmousemove'"
	 * @generated
	 */
	Object getOnmousemove();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnmousemove <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousemove</em>' attribute.
	 * @see #getOnmousemove()
	 * @generated
	 */
	void setOnmousemove(Object value);

	/**
	 * Returns the value of the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseout</em>' attribute.
	 * @see #setOnmouseout(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onmouseout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onmouseout'"
	 * @generated
	 */
	Object getOnmouseout();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnmouseout <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseout</em>' attribute.
	 * @see #getOnmouseout()
	 * @generated
	 */
	void setOnmouseout(Object value);

	/**
	 * Returns the value of the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseover</em>' attribute.
	 * @see #setOnmouseover(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onmouseover()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onmouseover'"
	 * @generated
	 */
	Object getOnmouseover();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnmouseover <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseover</em>' attribute.
	 * @see #getOnmouseover()
	 * @generated
	 */
	void setOnmouseover(Object value);

	/**
	 * Returns the value of the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseup</em>' attribute.
	 * @see #setOnmouseup(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Onmouseup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='onmouseup'"
	 * @generated
	 */
	Object getOnmouseup();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOnmouseup <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseup</em>' attribute.
	 * @see #getOnmouseup()
	 * @generated
	 */
	void setOnmouseup(Object value);

	/**
	 * Returns the value of the '<em><b>Orient</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.OrientType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orient</em>' attribute.
	 * @see org.docbook.ns.docbook.OrientType1
	 * @see #isSetOrient()
	 * @see #unsetOrient()
	 * @see #setOrient(OrientType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Orient()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orient'"
	 * @generated
	 */
	OrientType1 getOrient();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOrient <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orient</em>' attribute.
	 * @see org.docbook.ns.docbook.OrientType1
	 * @see #isSetOrient()
	 * @see #unsetOrient()
	 * @see #getOrient()
	 * @generated
	 */
	void setOrient(OrientType1 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOrient <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrient()
	 * @see #getOrient()
	 * @see #setOrient(OrientType1)
	 * @generated
	 */
	void unsetOrient();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOrient <em>Orient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orient</em>' attribute is set.
	 * @see #unsetOrient()
	 * @see #getOrient()
	 * @see #setOrient(OrientType1)
	 * @generated
	 */
	boolean isSetOrient();

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(Object value);

	/**
	 * Returns the value of the '<em><b>Pgwide</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.PgwideType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgwide</em>' attribute.
	 * @see org.docbook.ns.docbook.PgwideType5
	 * @see #isSetPgwide()
	 * @see #unsetPgwide()
	 * @see #setPgwide(PgwideType5)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Pgwide()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='pgwide'"
	 * @generated
	 */
	PgwideType5 getPgwide();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getPgwide <em>Pgwide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgwide</em>' attribute.
	 * @see org.docbook.ns.docbook.PgwideType5
	 * @see #isSetPgwide()
	 * @see #unsetPgwide()
	 * @see #getPgwide()
	 * @generated
	 */
	void setPgwide(PgwideType5 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getPgwide <em>Pgwide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPgwide()
	 * @see #getPgwide()
	 * @see #setPgwide(PgwideType5)
	 * @generated
	 */
	void unsetPgwide();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getPgwide <em>Pgwide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pgwide</em>' attribute is set.
	 * @see #unsetPgwide()
	 * @see #getPgwide()
	 * @see #setPgwide(PgwideType5)
	 * @generated
	 */
	boolean isSetPgwide();

	/**
	 * Returns the value of the '<em><b>Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap</em>' attribute.
	 * @see #setRemap(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRemap <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap</em>' attribute.
	 * @see #getRemap()
	 * @generated
	 */
	void setRemap(Object value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Object value);

	/**
	 * Returns the value of the '<em><b>Revisionflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RevisionflagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @generated
	 */
	void setRevisionflag(RevisionflagType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revisionflag</em>' attribute is set.
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	boolean isSetRevisionflag();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Rowheader</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RowheaderType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowheader</em>' attribute.
	 * @see org.docbook.ns.docbook.RowheaderType1
	 * @see #isSetRowheader()
	 * @see #unsetRowheader()
	 * @see #setRowheader(RowheaderType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Rowheader()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rowheader'"
	 * @generated
	 */
	RowheaderType1 getRowheader();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowheader <em>Rowheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowheader</em>' attribute.
	 * @see org.docbook.ns.docbook.RowheaderType1
	 * @see #isSetRowheader()
	 * @see #unsetRowheader()
	 * @see #getRowheader()
	 * @generated
	 */
	void setRowheader(RowheaderType1 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowheader <em>Rowheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowheader()
	 * @see #getRowheader()
	 * @see #setRowheader(RowheaderType1)
	 * @generated
	 */
	void unsetRowheader();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowheader <em>Rowheader</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowheader</em>' attribute is set.
	 * @see #unsetRowheader()
	 * @see #getRowheader()
	 * @see #setRowheader(RowheaderType1)
	 * @generated
	 */
	boolean isSetRowheader();

	/**
	 * Returns the value of the '<em><b>Rowsep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RowsepType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowsep</em>' attribute.
	 * @see org.docbook.ns.docbook.RowsepType2
	 * @see #isSetRowsep()
	 * @see #unsetRowsep()
	 * @see #setRowsep(RowsepType2)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Rowsep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rowsep'"
	 * @generated
	 */
	RowsepType2 getRowsep();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowsep <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowsep</em>' attribute.
	 * @see org.docbook.ns.docbook.RowsepType2
	 * @see #isSetRowsep()
	 * @see #unsetRowsep()
	 * @see #getRowsep()
	 * @generated
	 */
	void setRowsep(RowsepType2 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowsep <em>Rowsep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowsep()
	 * @see #getRowsep()
	 * @see #setRowsep(RowsepType2)
	 * @generated
	 */
	void unsetRowsep();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRowsep <em>Rowsep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowsep</em>' attribute is set.
	 * @see #unsetRowsep()
	 * @see #getRowsep()
	 * @see #setRowsep(RowsepType2)
	 * @generated
	 */
	boolean isSetRowsep();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RulesType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see org.docbook.ns.docbook.RulesType1
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #setRules(RulesType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Rules()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rules'"
	 * @generated
	 */
	RulesType1 getRules();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see org.docbook.ns.docbook.RulesType1
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #getRules()
	 * @generated
	 */
	void setRules(RulesType1 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType1)
	 * @generated
	 */
	void unsetRules();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getRules <em>Rules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rules</em>' attribute is set.
	 * @see #unsetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType1)
	 * @generated
	 */
	boolean isSetRules();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.InformaltableType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	Object getStyle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Object value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Summary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='summary'"
	 * @generated
	 */
	Object getSummary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(Object value);

	/**
	 * Returns the value of the '<em><b>Tabstyle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabstyle</em>' attribute.
	 * @see #setTabstyle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Tabstyle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='tabstyle'"
	 * @generated
	 */
	Object getTabstyle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getTabstyle <em>Tabstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabstyle</em>' attribute.
	 * @see #getTabstyle()
	 * @generated
	 */
	void setTabstyle(Object value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' attribute.
	 * @see #setTitle1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Title1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	Object getTitle1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getTitle1 <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title1</em>' attribute.
	 * @see #getTitle1()
	 * @generated
	 */
	void setTitle1(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(Object value);

	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getInformaltableType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.InformaltableType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

} // InformaltableType
