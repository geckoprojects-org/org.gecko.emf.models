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
package org.omg.spec.cmmn.cmmndi;

import org.omg.spec.cmmn.dc.AlignmentKind;
import org.omg.spec.cmmn.dc.Color;

import org.omg.spec.cmmn.di.Style;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold <em>Font Bold</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline <em>Font Underline</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle()
 * @model extendedMetaData="name='CMMNStyle' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CMMNStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' containment reference.
	 * @see #setFillColor(Color)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FillColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FillColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getFillColor();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFillColor <em>Fill Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' containment reference.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(Color value);

	/**
	 * Returns the value of the '<em><b>Stroke Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Color</em>' containment reference.
	 * @see #setStrokeColor(Color)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_StrokeColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StrokeColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getStrokeColor();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getStrokeColor <em>Stroke Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Color</em>' containment reference.
	 * @see #getStrokeColor()
	 * @generated
	 */
	void setStrokeColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' containment reference.
	 * @see #setFontColor(Color)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FontColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getFontColor();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontColor <em>Font Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' containment reference.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Bold</em>' attribute.
	 * @see #isSetFontBold()
	 * @see #unsetFontBold()
	 * @see #setFontBold(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontBold()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fontBold'"
	 * @generated
	 */
	boolean isFontBold();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Bold</em>' attribute.
	 * @see #isSetFontBold()
	 * @see #unsetFontBold()
	 * @see #isFontBold()
	 * @generated
	 */
	void setFontBold(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontBold()
	 * @see #isFontBold()
	 * @see #setFontBold(boolean)
	 * @generated
	 */
	void unsetFontBold();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontBold <em>Font Bold</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Bold</em>' attribute is set.
	 * @see #unsetFontBold()
	 * @see #isFontBold()
	 * @see #setFontBold(boolean)
	 * @generated
	 */
	boolean isSetFontBold();

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontFamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fontFamily'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Italic</em>' attribute.
	 * @see #isSetFontItalic()
	 * @see #unsetFontItalic()
	 * @see #setFontItalic(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontItalic()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fontItalic'"
	 * @generated
	 */
	boolean isFontItalic();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Italic</em>' attribute.
	 * @see #isSetFontItalic()
	 * @see #unsetFontItalic()
	 * @see #isFontItalic()
	 * @generated
	 */
	void setFontItalic(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontItalic()
	 * @see #isFontItalic()
	 * @see #setFontItalic(boolean)
	 * @generated
	 */
	void unsetFontItalic();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontItalic <em>Font Italic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Italic</em>' attribute is set.
	 * @see #unsetFontItalic()
	 * @see #isFontItalic()
	 * @see #setFontItalic(boolean)
	 * @generated
	 */
	boolean isSetFontItalic();

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #setFontSize(double)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='fontSize'"
	 * @generated
	 */
	double getFontSize();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(double value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(double)
	 * @generated
	 */
	void unsetFontSize();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getFontSize <em>Font Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Size</em>' attribute is set.
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(double)
	 * @generated
	 */
	boolean isSetFontSize();

	/**
	 * Returns the value of the '<em><b>Font Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Strike Through</em>' attribute.
	 * @see #isSetFontStrikeThrough()
	 * @see #unsetFontStrikeThrough()
	 * @see #setFontStrikeThrough(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontStrikeThrough()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fontStrikeThrough'"
	 * @generated
	 */
	boolean isFontStrikeThrough();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Strike Through</em>' attribute.
	 * @see #isSetFontStrikeThrough()
	 * @see #unsetFontStrikeThrough()
	 * @see #isFontStrikeThrough()
	 * @generated
	 */
	void setFontStrikeThrough(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStrikeThrough()
	 * @see #isFontStrikeThrough()
	 * @see #setFontStrikeThrough(boolean)
	 * @generated
	 */
	void unsetFontStrikeThrough();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontStrikeThrough <em>Font Strike Through</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Strike Through</em>' attribute is set.
	 * @see #unsetFontStrikeThrough()
	 * @see #isFontStrikeThrough()
	 * @see #setFontStrikeThrough(boolean)
	 * @generated
	 */
	boolean isSetFontStrikeThrough();

	/**
	 * Returns the value of the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Underline</em>' attribute.
	 * @see #isSetFontUnderline()
	 * @see #unsetFontUnderline()
	 * @see #setFontUnderline(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_FontUnderline()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fontUnderline'"
	 * @generated
	 */
	boolean isFontUnderline();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline <em>Font Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Underline</em>' attribute.
	 * @see #isSetFontUnderline()
	 * @see #unsetFontUnderline()
	 * @see #isFontUnderline()
	 * @generated
	 */
	void setFontUnderline(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline <em>Font Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontUnderline()
	 * @see #isFontUnderline()
	 * @see #setFontUnderline(boolean)
	 * @generated
	 */
	void unsetFontUnderline();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#isFontUnderline <em>Font Underline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Underline</em>' attribute is set.
	 * @see #unsetFontUnderline()
	 * @see #isFontUnderline()
	 * @see #setFontUnderline(boolean)
	 * @generated
	 */
	boolean isSetFontUnderline();

	/**
	 * Returns the value of the '<em><b>Label Horizontal Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.spec.cmmn.dc.AlignmentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Horizontal Alignement</em>' attribute.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see #isSetLabelHorizontalAlignement()
	 * @see #unsetLabelHorizontalAlignement()
	 * @see #setLabelHorizontalAlignement(AlignmentKind)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_LabelHorizontalAlignement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='labelHorizontalAlignement'"
	 * @generated
	 */
	AlignmentKind getLabelHorizontalAlignement();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Horizontal Alignement</em>' attribute.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see #isSetLabelHorizontalAlignement()
	 * @see #unsetLabelHorizontalAlignement()
	 * @see #getLabelHorizontalAlignement()
	 * @generated
	 */
	void setLabelHorizontalAlignement(AlignmentKind value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelHorizontalAlignement()
	 * @see #getLabelHorizontalAlignement()
	 * @see #setLabelHorizontalAlignement(AlignmentKind)
	 * @generated
	 */
	void unsetLabelHorizontalAlignement();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelHorizontalAlignement <em>Label Horizontal Alignement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Horizontal Alignement</em>' attribute is set.
	 * @see #unsetLabelHorizontalAlignement()
	 * @see #getLabelHorizontalAlignement()
	 * @see #setLabelHorizontalAlignement(AlignmentKind)
	 * @generated
	 */
	boolean isSetLabelHorizontalAlignement();

	/**
	 * Returns the value of the '<em><b>Label Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.spec.cmmn.dc.AlignmentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Vertical Alignment</em>' attribute.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see #isSetLabelVerticalAlignment()
	 * @see #unsetLabelVerticalAlignment()
	 * @see #setLabelVerticalAlignment(AlignmentKind)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNStyle_LabelVerticalAlignment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='labelVerticalAlignment'"
	 * @generated
	 */
	AlignmentKind getLabelVerticalAlignment();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Vertical Alignment</em>' attribute.
	 * @see org.omg.spec.cmmn.dc.AlignmentKind
	 * @see #isSetLabelVerticalAlignment()
	 * @see #unsetLabelVerticalAlignment()
	 * @see #getLabelVerticalAlignment()
	 * @generated
	 */
	void setLabelVerticalAlignment(AlignmentKind value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelVerticalAlignment()
	 * @see #getLabelVerticalAlignment()
	 * @see #setLabelVerticalAlignment(AlignmentKind)
	 * @generated
	 */
	void unsetLabelVerticalAlignment();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNStyle#getLabelVerticalAlignment <em>Label Vertical Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Vertical Alignment</em>' attribute is set.
	 * @see #unsetLabelVerticalAlignment()
	 * @see #getLabelVerticalAlignment()
	 * @see #setLabelVerticalAlignment(AlignmentKind)
	 * @generated
	 */
	boolean isSetLabelVerticalAlignment();

} // CMMNStyle
